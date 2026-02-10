package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stamp: ImageVector? = null

val Icons.Sc.Stamp: ImageVector
    get() = _Stamp ?: UXIcon(name = "Stamp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 18f)
                curveToRelative(-7.08f, 0f, -10.19f, -1.01f, -10.32f, -1.05f)
                curveToRelative(-0.41f, -0.14f, -0.68f, -0.52f, -0.68f, -0.95f)
                verticalLineToRelative(-3.02f)
                curveToRelative(0f, -0.43f, 0.28f, -0.81f, 0.69f, -0.95f)
                curveToRelative(0.1f, -0.03f, 2.38f, -0.77f, 7.42f, -0.99f)
                curveToRelative(-0.58f, -3.14f, -0.96f, -6.1f, -1.07f, -7.67f)
                curveToRelative(-0.07f, -0.98f, 0.57f, -1.85f, 1.52f, -2.08f)
                curveToRelative(1.08f, -0.37f, 3.8f, -0.37f, 4.88f, 0f)
                curveToRelative(0.95f, 0.23f, 1.59f, 1.1f, 1.52f, 2.08f)
                curveToRelative(-0.11f, 1.56f, -0.48f, 4.52f, -1.07f, 7.67f)
                curveToRelative(5.04f, 0.22f, 7.32f, 0.95f, 7.42f, 0.99f)
                curveToRelative(0.41f, 0.14f, 0.69f, 0.52f, 0.69f, 0.95f)
                verticalLineToRelative(3.02f)
                curveToRelative(0f, 0.43f, -0.28f, 0.81f, -0.68f, 0.95f)
                curveToRelative(-0.13f, 0.04f, -3.23f, 1.05f, -10.32f, 1.05f)
                close()
                moveTo(20.87f, 22.32f)
                curveToRelative(0.8f, -0.2f, 1.29f, -1.02f, 1.08f, -1.82f)
                curveToRelative(-0.2f, -0.8f, -1.02f, -1.29f, -1.82f, -1.08f)
                curveToRelative(-0.85f, 0.22f, -3.52f, 0.58f, -8.13f, 0.58f)
                reflectiveCurveToRelative(-7.28f, -0.36f, -8.13f, -0.58f)
                curveToRelative(-0.81f, -0.21f, -1.62f, 0.28f, -1.82f, 1.08f)
                curveToRelative(-0.2f, 0.8f, 0.28f, 1.62f, 1.08f, 1.82f)
                curveToRelative(1.28f, 0.33f, 4.28f, 0.68f, 8.87f, 0.68f)
                reflectiveCurveToRelative(7.59f, -0.35f, 8.87f, -0.68f)
                close()
            }
        }.also { _Stamp = it}
