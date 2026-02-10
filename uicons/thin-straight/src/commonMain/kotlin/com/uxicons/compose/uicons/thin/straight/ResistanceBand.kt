package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ResistanceBand: ImageVector? = null

val Icons.Ts.ResistanceBand: ImageVector
    get() = _ResistanceBand ?: UXIcon(name = "ResistanceBand") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 17.05f)
                verticalLineToRelative(-8.05f)
                curveTo(21f, 4.04f, 16.96f, 0f, 12f, 0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                curveToRelative(2.79f, 0f, 5.13f, -1.92f, 5.8f, -4.5f)
                curveToRelative(-0.17f, -0.68f, -0.46f, -1.31f, -0.84f, -1.87f)
                curveToRelative(0.01f, 0.12f, 0.04f, 0.24f, 0.04f, 0.37f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(9.24f, 1f, 12f, 1f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                verticalLineToRelative(8.05f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.69f, -3f, 3.45f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.76f, -1.31f, -3.2f, -3f, -3.45f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(4f, 17.05f)
                lineTo(4f, 6f)
                curveToRelative(0f, -0.46f, 0.05f, -0.91f, 0.12f, -1.34f)
                curveToRelative(-0.71f, 1.29f, -1.12f, 2.77f, -1.12f, 4.34f)
                verticalLineToRelative(8.05f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.69f, -3f, 3.45f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.76f, -1.31f, -3.2f, -3f, -3.45f)
                close()
                moveTo(6f, 23f)
                lineTo(1f, 23f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _ResistanceBand = it}
