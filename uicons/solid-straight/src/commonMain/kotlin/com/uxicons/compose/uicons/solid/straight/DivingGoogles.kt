package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DivingGoogles: ImageVector? = null

val Icons.Ss.DivingGoogles: ImageVector
    get() = _DivingGoogles ?: UXIcon(name = "DivingGoogles") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.57f, 0f)
                horizontalLineToRelative(-3.14f)
                curveToRelative(-5.75f, 0f, -10.43f, 4.68f, -10.43f, 10.43f)
                verticalLineToRelative(8.77f)
                curveToRelative(0f, 1.4f, 0.73f, 2.67f, 1.96f, 3.4f)
                curveToRelative(1.12f, 0.66f, 2.36f, 1.4f, 4.38f, 1.4f)
                curveToRelative(1.36f, 0f, 2.65f, -0.57f, 3.54f, -1.57f)
                curveToRelative(0.21f, -0.23f, 0.4f, -0.48f, 0.55f, -0.74f)
                curveToRelative(0.13f, -0.27f, 0.89f, -0.69f, 1.58f, -0.69f)
                reflectiveCurveToRelative(1.45f, 0.42f, 1.58f, 0.69f)
                curveToRelative(0.15f, 0.26f, 0.34f, 0.51f, 0.55f, 0.74f)
                curveToRelative(0.89f, 1.0f, 2.18f, 1.57f, 3.54f, 1.57f)
                curveToRelative(2.02f, 0f, 3.26f, -0.74f, 4.38f, -1.4f)
                curveToRelative(1.23f, -0.73f, 1.96f, -2f, 1.96f, -3.4f)
                verticalLineToRelative(-8.77f)
                curveToRelative(0f, -5.75f, -4.68f, -10.43f, -10.43f, -10.43f)
                close()
                moveTo(22f, 16.27f)
                curveToRelative(-0.94f, -0.58f, -2.22f, -1.14f, -3.78f, -1.25f)
                curveToRelative(-1.94f, -0.15f, -3.75f, 0.81f, -4.64f, 2.29f)
                curveToRelative(-0.13f, 0.27f, -0.89f, 0.69f, -1.58f, 0.69f)
                reflectiveCurveToRelative(-1.45f, -0.42f, -1.58f, -0.69f)
                curveToRelative(-0.89f, -1.49f, -2.71f, -2.44f, -4.64f, -2.29f)
                curveToRelative(-1.56f, 0.11f, -2.84f, 0.67f, -3.78f, 1.25f)
                verticalLineToRelative(-5.84f)
                curveToRelative(0.0f, -4.65f, 3.78f, -8.43f, 8.43f, -8.43f)
                horizontalLineToRelative(3.14f)
                curveToRelative(4.65f, 0f, 8.43f, 3.78f, 8.43f, 8.43f)
                verticalLineToRelative(5.84f)
                close()
            }
        }.also { _DivingGoogles = it}
