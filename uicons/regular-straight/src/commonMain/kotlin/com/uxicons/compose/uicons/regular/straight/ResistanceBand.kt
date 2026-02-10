package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ResistanceBand: ImageVector? = null

val Icons.Rs.ResistanceBand: ImageVector
    get() = _ResistanceBand ?: UXIcon(name = "ResistanceBand") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 16.14f)
                verticalLineToRelative(-7.14f)
                curveTo(21f, 4.04f, 16.96f, 0f, 12f, 0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                curveToRelative(2.09f, 0f, 3.92f, -1.07f, 5f, -2.69f)
                verticalLineToRelative(-0.31f)
                curveToRelative(0f, -1.12f, -0.38f, -2.14f, -1.0f, -2.97f)
                curveToRelative(-0.01f, 2.19f, -1.8f, 3.97f, -4.0f, 3.97f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                verticalLineToRelative(7.14f)
                curveToRelative(-1.72f, 0.45f, -3f, 2.0f, -3f, 3.86f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.86f, -1.28f, -3.41f, -3f, -3.86f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                close()
                moveTo(5f, 16.14f)
                verticalLineToRelative(-6.28f)
                curveToRelative(-0.64f, -1.15f, -1f, -2.46f, -1f, -3.86f)
                curveToRelative(0f, -0.46f, 0.05f, -0.91f, 0.12f, -1.34f)
                curveToRelative(-0.71f, 1.29f, -1.12f, 2.77f, -1.12f, 4.34f)
                verticalLineToRelative(7.14f)
                curveToRelative(-1.72f, 0.45f, -3f, 2.0f, -3f, 3.86f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.86f, -1.28f, -3.41f, -3f, -3.86f)
                close()
                moveTo(6f, 22f)
                lineTo(2f, 22f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _ResistanceBand = it}
