package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Equality: ImageVector? = null

val Icons.Ts.Equality: ImageVector
    get() = _Equality ?: UXIcon(name = "Equality") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.83f, 2f)
                horizontalLineToRelative(-7.33f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 2f)
                lineTo(4.17f, 2f)
                lineTo(0.04f, 11.81f)
                lineToRelative(-0.04f, 0.69f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-0.5f)
                lineTo(5.25f, 3f)
                horizontalLineToRelative(6.25f)
                lineTo(11.5f, 23f)
                lineTo(4f, 23f)
                verticalLineToRelative(1f)
                lineTo(20f, 24f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-7.5f)
                lineTo(12.5f, 3f)
                horizontalLineToRelative(6.25f)
                lineToRelative(-3.71f, 8.81f)
                lineToRelative(-0.04f, 0.69f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-0.5f)
                lineTo(19.83f, 2f)
                close()
                moveTo(4.5f, 16f)
                curveToRelative(-1.76f, 0f, -3.22f, -1.31f, -3.46f, -3f)
                lineTo(7.96f, 13f)
                curveToRelative(-0.24f, 1.69f, -1.71f, 3f, -3.46f, 3f)
                close()
                moveTo(1.04f, 12f)
                lineTo(4.5f, 3.79f)
                lineToRelative(3.46f, 8.21f)
                lineTo(1.04f, 12f)
                close()
                moveTo(19.5f, 3.79f)
                lineToRelative(3.46f, 8.21f)
                horizontalLineToRelative(-6.91f)
                lineToRelative(3.46f, -8.21f)
                close()
                moveTo(19.5f, 16f)
                curveToRelative(-1.76f, 0f, -3.22f, -1.31f, -3.46f, -3f)
                horizontalLineToRelative(6.93f)
                curveToRelative(-0.24f, 1.69f, -1.71f, 3f, -3.46f, 3f)
                close()
            }
        }.also { _Equality = it}
