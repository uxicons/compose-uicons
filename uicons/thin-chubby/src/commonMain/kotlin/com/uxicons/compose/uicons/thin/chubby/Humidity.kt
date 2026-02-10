package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Humidity: ImageVector? = null

val Icons.Tc.Humidity: ImageVector
    get() = _Humidity ?: UXIcon(name = "Humidity") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.85f, 10.7f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.15f, 15.4f)
                moveToRelative(-0.75f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.24f, 1.06f)
                curveToRelative(-0.15f, -0.08f, -0.34f, -0.08f, -0.49f, 0.01f)
                curveToRelative(-0.4f, 0.23f, -9.66f, 5.62f, -9.77f, 12.12f)
                curveToRelative(0.15f, 4.98f, 5.02f, 9.74f, 10.03f, 9.81f)
                curveToRelative(5.0f, -0.07f, 10.02f, -4.98f, 10.02f, -9.84f)
                curveTo(22.02f, 6.58f, 12.63f, 1.27f, 12.24f, 1.06f)
                close()
                moveTo(12.01f, 22f)
                curveToRelative(-4.42f, -0.06f, -8.89f, -4.44f, -9.03f, -8.82f)
                curveToRelative(0.09f, -5.37f, 7.58f, -10.21f, 9.03f, -11.1f)
                curveToRelative(1.46f, 0.85f, 8.9f, 5.45f, 9.02f, 11.09f)
                curveToRelative(-0.14f, 4.4f, -4.61f, 8.77f, -9.02f, 8.83f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.35f, 8.89f)
                curveToRelative(-0.24f, -0.14f, -0.54f, -0.05f, -0.68f, 0.19f)
                lineToRelative(-4.21f, 7.44f)
                curveToRelative(-0.14f, 0.24f, -0.05f, 0.55f, 0.19f, 0.68f)
                curveToRelative(0.08f, 0.04f, 0.16f, 0.07f, 0.25f, 0.07f)
                curveToRelative(0.17f, 0f, 0.34f, -0.09f, 0.44f, -0.25f)
                lineToRelative(4.21f, -7.44f)
                curveToRelative(0.14f, -0.24f, 0.05f, -0.55f, -0.19f, -0.68f)
                close()
            }
        }.also { _Humidity = it}
