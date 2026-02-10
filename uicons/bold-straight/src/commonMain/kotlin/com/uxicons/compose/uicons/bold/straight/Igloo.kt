package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Igloo: ImageVector? = null

val Icons.Bs.Igloo: ImageVector
    get() = _Igloo ?: UXIcon(name = "Igloo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                verticalLineToRelative(12f)
                lineTo(10f, 24f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(10f)
                lineTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(20.78f, 10f)
                curveToRelative(0.15f, 0.64f, 0.22f, 1.31f, 0.22f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3.78f)
                close()
                moveTo(19.48f, 7f)
                horizontalLineToRelative(-5.98f)
                lineTo(13.5f, 3.13f)
                curveToRelative(2.49f, 0.42f, 4.63f, 1.86f, 5.98f, 3.87f)
                close()
                moveTo(10.5f, 3.13f)
                verticalLineToRelative(3.87f)
                lineTo(4.52f, 7f)
                curveToRelative(1.35f, -2.02f, 3.49f, -3.46f, 5.98f, -3.87f)
                close()
                moveTo(7f, 14f)
                lineTo(3f, 14f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.69f, 0.08f, -1.36f, 0.22f, -2f)
                horizontalLineToRelative(3.78f)
                verticalLineToRelative(4f)
                close()
                moveTo(7f, 21f)
                lineTo(3f, 21f)
                verticalLineToRelative(-4f)
                lineTo(7.1f, 17f)
                curveToRelative(-0.07f, 0.32f, -0.1f, 0.66f, -0.1f, 1f)
                verticalLineToRelative(3f)
                close()
                moveTo(12f, 13f)
                curveToRelative(-0.71f, 0f, -1.39f, 0.15f, -2f, 0.42f)
                verticalLineToRelative(-3.42f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3.42f)
                curveToRelative(-0.61f, -0.27f, -1.29f, -0.42f, -2f, -0.42f)
                close()
                moveTo(17f, 21f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.34f, -0.04f, -0.68f, -0.1f, -1f)
                horizontalLineToRelative(4.1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _Igloo = it}
