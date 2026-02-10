package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Boss: ImageVector? = null

val Icons.Ts.Boss: ImageVector
    get() = _Boss ?: UXIcon(name = "Boss") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(14.76f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                close()
                moveTo(12f, 1f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(24f, 20f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(4.5f)
                lineTo(0f, 20f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(19f, 15.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-4.61f)
                lineToRelative(-1.35f, -5.41f)
                lineToRelative(1.73f, -2.59f)
                horizontalLineToRelative(0.73f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(12f, 14.35f)
                lineToRelative(-1.57f, -2.35f)
                horizontalLineToRelative(3.13f)
                lineToRelative(-1.57f, 2.35f)
                close()
                moveTo(12f, 14.56f)
                lineToRelative(1.36f, 5.44f)
                horizontalLineToRelative(-2.72f)
                lineToRelative(1.36f, -5.44f)
                close()
                moveTo(5f, 15.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(0.73f)
                lineToRelative(1.73f, 2.59f)
                lineToRelative(-1.35f, 5.41f)
                horizontalLineToRelative(-4.61f)
                verticalLineToRelative(-4.5f)
                close()
            }
        }.also { _Boss = it}
