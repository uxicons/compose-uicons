package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sink: ImageVector? = null

val Icons.Tc.Sink: ImageVector
    get() = _Sink ?: UXIcon(name = "Sink") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.86f, 12.15f)
                curveToRelative(-0.09f, -0.1f, -0.23f, -0.15f, -0.36f, -0.15f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-5.54f)
                curveToRelative(0f, -2.51f, 0.07f, -6.29f, 1.37f, -8.91f)
                curveToRelative(0.3f, -0.55f, 0.69f, -1.07f, 2.46f, -1.09f)
                curveToRelative(1.99f, 0f, 2.67f, 0.63f, 2.71f, 2.51f)
                curveToRelative(0.01f, 0.27f, 0.23f, 0.49f, 0.5f, 0.49f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.28f, -0.01f, 0.49f, -0.23f, 0.49f, -0.51f)
                curveToRelative(-0.05f, -2.41f, -1.2f, -3.49f, -3.71f, -3.49f)
                curveToRelative(-1.09f, -0.01f, -2.62f, 0.2f, -3.32f, 1.58f)
                curveToRelative(-1.43f, 2.82f, -1.51f, 6.8f, -1.51f, 9.42f)
                horizontalLineToRelative(-5.46f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.28f, -0.01f, -0.52f, 0.24f, -0.5f, 0.52f)
                curveToRelative(0.29f, 7.35f, 3.58f, 10.48f, 11f, 10.48f)
                reflectiveCurveToRelative(10.71f, -3.13f, 11f, -10.48f)
                curveToRelative(0.01f, -0.14f, -0.04f, -0.27f, -0.14f, -0.37f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-6.75f, 0f, -9.58f, -2.53f, -9.97f, -9f)
                horizontalLineToRelative(19.95f)
                curveToRelative(-0.39f, 6.47f, -3.23f, 9f, -9.97f, 9f)
                close()
            }
        }.also { _Sink = it}
