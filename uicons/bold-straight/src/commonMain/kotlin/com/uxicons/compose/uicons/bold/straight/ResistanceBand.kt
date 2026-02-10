package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ResistanceBand: ImageVector? = null

val Icons.Bs.ResistanceBand: ImageVector
    get() = _ResistanceBand ?: UXIcon(name = "ResistanceBand") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 15.28f)
                verticalLineToRelative(-4.0f)
                curveToRelative(-1.24f, -1.41f, -2f, -3.25f, -2f, -5.27f)
                curveToRelative(0f, -0.46f, 0.05f, -0.91f, 0.12f, -1.34f)
                curveToRelative(-0.71f, 1.29f, -1.12f, 2.77f, -1.12f, 4.34f)
                verticalLineToRelative(6.28f)
                curveToRelative(-1.74f, 0.62f, -3f, 2.27f, -3f, 4.22f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.95f, -1.26f, -3.6f, -3f, -4.22f)
                close()
                moveTo(6f, 21f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(21f, 15.28f)
                verticalLineToRelative(-6.28f)
                curveTo(21f, 4.04f, 16.96f, 0f, 12f, 0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                curveToRelative(1.54f, 0f, 2.94f, -0.59f, 4f, -1.54f)
                verticalLineToRelative(-1.46f)
                curveToRelative(0f, -1.02f, -0.4f, -1.95f, -1.03f, -2.66f)
                curveToRelative(-0.17f, 1.49f, -1.43f, 2.66f, -2.97f, 2.66f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                verticalLineToRelative(6.28f)
                curveToRelative(-1.74f, 0.62f, -3f, 2.27f, -3f, 4.22f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.95f, -1.26f, -3.6f, -3f, -4.22f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _ResistanceBand = it}
