package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bullhorn: ImageVector? = null

val Icons.Sr.Bullhorn: ImageVector
    get() = _Bullhorn ?: UXIcon(name = "Bullhorn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 11.95f)
                verticalLineToRelative(6.05f)
                curveToRelative(0f, 0.52f, -0.4f, 0.95f, -0.92f, 1.0f)
                curveToRelative(-0.03f, 0.0f, -0.06f, 0.0f, -0.08f, 0.0f)
                curveToRelative(-0.48f, 0f, -0.9f, -0.35f, -0.98f, -0.83f)
                curveToRelative(-0.39f, -2.33f, -3.62f, -3.17f, -6.51f, -3.17f)
                horizontalLineToRelative(-4.5f)
                lineTo(9.0f, 4f)
                horizontalLineToRelative(4.5f)
                curveToRelative(2.89f, 0f, 6.12f, -0.83f, 6.51f, -3.17f)
                curveToRelative(0.09f, -0.51f, 0.56f, -0.88f, 1.07f, -0.83f)
                curveToRelative(0.52f, 0.04f, 0.92f, 0.48f, 0.92f, 1.0f)
                verticalLineToRelative(6.05f)
                curveToRelative(1.14f, 0.23f, 2f, 1.24f, 2f, 2.45f)
                reflectiveCurveToRelative(-0.86f, 2.22f, -2f, 2.45f)
                close()
                moveTo(7f, 15f)
                lineTo(7f, 4f)
                horizontalLineToRelative(-1.5f)
                curveTo(2.47f, 4f, 0f, 6.47f, 0f, 9.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(8.52f, 17f)
                horizontalLineToRelative(-3.02f)
                curveToRelative(-0.88f, 0f, -1.72f, -0.15f, -2.5f, -0.43f)
                lineToRelative(2.17f, 5.79f)
                curveToRelative(0.23f, 0.62f, 0.69f, 1.12f, 1.29f, 1.41f)
                curveToRelative(0.34f, 0.16f, 0.69f, 0.23f, 1.05f, 0.23f)
                curveToRelative(0.29f, 0f, 0.58f, -0.05f, 0.85f, -0.15f)
                curveToRelative(0.62f, -0.23f, 1.12f, -0.69f, 1.41f, -1.29f)
                curveToRelative(0.28f, -0.6f, 0.31f, -1.28f, 0.08f, -1.9f)
                lineToRelative(-1.32f, -3.66f)
                close()
            }
        }.also { _Bullhorn = it}
