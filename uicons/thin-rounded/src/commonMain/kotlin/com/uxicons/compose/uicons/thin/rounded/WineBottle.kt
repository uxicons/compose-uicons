package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineBottle: ImageVector? = null

val Icons.Tr.WineBottle: ImageVector
    get() = _WineBottle ?: UXIcon(name = "WineBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.01f, 9.4f)
                lineToRelative(-4.0f, -2.66f)
                lineTo(15.01f, 1.51f)
                curveTo(15.01f, 0.68f, 14.34f, 0.01f, 13.51f, 0.01f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(5.23f)
                lineToRelative(-4.0f, 2.66f)
                curveToRelative(-1.25f, 0.84f, -2.0f, 2.24f, -2.0f, 3.75f)
                verticalLineToRelative(6.36f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-6.36f)
                curveToRelative(0f, -1.51f, -0.75f, -2.91f, -2.0f, -3.75f)
                close()
                moveTo(10.51f, 1.01f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(20.01f, 19.51f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(7.51f, 23.01f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(4.01f, 14.01f)
                reflectiveCurveToRelative(0f, -0.86f, 0f, -0.86f)
                curveToRelative(0f, -1.17f, 0.58f, -2.26f, 1.56f, -2.91f)
                lineToRelative(4.22f, -2.81f)
                curveToRelative(0.14f, -0.09f, 0.22f, -0.25f, 0.22f, -0.42f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.17f, 0.08f, 0.32f, 0.22f, 0.42f)
                lineToRelative(4.22f, 2.81f)
                curveToRelative(0.98f, 0.65f, 1.56f, 1.74f, 1.56f, 2.91f)
                verticalLineToRelative(6.36f)
                close()
            }
        }.also { _WineBottle = it}
