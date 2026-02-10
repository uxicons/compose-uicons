package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UniformMartialArts: ImageVector? = null

val Icons.Sr.UniformMartialArts: ImageVector
    get() = _UniformMartialArts ?: UXIcon(name = "UniformMartialArts") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.42f, 0f)
                lineToRelative(-6.84f, 0f)
                lineToRelative(3.44f, 6.03f)
                lineToRelative(3.39f, -6.03f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.37f, 0.16f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                close()
                moveTo(6.37f, 0.16f)
                curveToRelative(-0.62f, 0.12f, -1.32f, 0.3f, -1.94f, 0.54f)
                curveTo(1.78f, 1.71f, 0f, 4.33f, 0f, 7.2f)
                verticalLineToRelative(11.8f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(1f)
                lineTo(3f, 8f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(1.98f)
                lineToRelative(3.9f, -6.94f)
                lineTo(6.37f, 0.16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.83f, -0.51f, -1.75f, -1f, -2.44f)
                curveToRelative(-0.49f, 0.68f, -1f, 1.61f, -1f, 2.44f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1.11f, 0.46f, -2.17f, 0.97f, -3f)
                horizontalLineTo(5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4.97f)
                curveToRelative(0.51f, 0.83f, 0.97f, 1.89f, 0.97f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.58f, 0.69f)
                curveToRelative(-0.65f, -0.25f, -1.3f, -0.43f, -1.95f, -0.54f)
                curveToRelative(-0.0f, 0f, -0.0f, 0.0f, -0.0f, 0.0f)
                lineTo(9.27f, 15f)
                horizontalLineToRelative(9.73f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(1f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(7.2f)
                curveToRelative(0f, -2.88f, -1.78f, -5.5f, -4.42f, -6.51f)
                close()
            }
        }.also { _UniformMartialArts = it}
