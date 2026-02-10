package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Humidity: ImageVector? = null

val Icons.Rc.Humidity: ImageVector
    get() = _Humidity ?: UXIcon(name = "Humidity") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 10.77f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 15.23f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.48f, 1.12f)
                curveToRelative(-0.3f, -0.17f, -0.68f, -0.16f, -0.97f, 0.01f)
                curveToRelative(-0.39f, 0.22f, -9.44f, 5.5f, -9.55f, 12.01f)
                curveToRelative(0.15f, 5.0f, 5.03f, 9.78f, 10.06f, 9.85f)
                curveToRelative(5.0f, -0.07f, 10.03f, -5.03f, 10.03f, -9.9f)
                curveTo(22.04f, 6.5f, 12.86f, 1.33f, 12.48f, 1.12f)
                close()
                moveTo(12.01f, 21f)
                curveToRelative(-3.95f, -0.05f, -7.94f, -3.97f, -8.06f, -7.87f)
                curveToRelative(0.08f, -4.58f, 6.26f, -8.83f, 8.06f, -9.97f)
                curveToRelative(1.8f, 1.09f, 7.92f, 5.14f, 8.03f, 9.95f)
                curveToRelative(-0.14f, 3.93f, -4.12f, 7.83f, -8.03f, 7.89f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.49f, 8.59f)
                curveToRelative(-0.48f, -0.27f, -1.09f, -0.1f, -1.36f, 0.38f)
                lineToRelative(-4f, 7.08f)
                curveToRelative(-0.27f, 0.48f, -0.1f, 1.09f, 0.38f, 1.36f)
                curveToRelative(0.29f, 0.16f, 0.89f, 0.3f, 1.36f, -0.38f)
                lineToRelative(4f, -7.08f)
                curveToRelative(0.27f, -0.48f, 0.1f, -1.09f, -0.38f, -1.36f)
                close()
            }
        }.also { _Humidity = it}
