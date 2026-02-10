package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Balloon: ImageVector? = null

val Icons.Sr.Balloon: ImageVector
    get() = _Balloon ?: UXIcon(name = "Balloon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 9.38f)
                curveTo(22f, 4.21f, 17.51f, 0.01f, 12f, 0.01f)
                reflectiveCurveTo(2f, 4.21f, 2f, 9.38f)
                curveToRelative(0f, 5.29f, 3.36f, 11.12f, 8.11f, 12.38f)
                curveToRelative(-0.25f, 0.38f, -0.46f, 0.81f, -0.58f, 1.25f)
                curveToRelative(-0.14f, 0.5f, 0.24f, 1.0f, 0.76f, 1.0f)
                horizontalLineToRelative(3.42f)
                curveToRelative(0.52f, 0f, 0.91f, -0.5f, 0.76f, -1.0f)
                curveToRelative(-0.13f, -0.43f, -0.33f, -0.86f, -0.58f, -1.25f)
                curveToRelative(4.75f, -1.26f, 8.11f, -7.09f, 8.11f, -12.38f)
                close()
                moveTo(15.35f, 14.63f)
                curveToRelative(-0.33f, 0.49f, -1.0f, 0.58f, -1.44f, 0.19f)
                curveToRelative(-0.36f, -0.33f, -0.41f, -0.86f, -0.14f, -1.27f)
                curveToRelative(0.49f, -0.74f, 0.93f, -1.7f, 1.13f, -2.78f)
                curveToRelative(0.08f, -0.45f, 0.48f, -0.77f, 0.93f, -0.77f)
                horizontalLineToRelative(0.03f)
                curveToRelative(0.6f, 0f, 1.06f, 0.55f, 0.94f, 1.14f)
                curveToRelative(-0.27f, 1.36f, -0.84f, 2.56f, -1.46f, 3.49f)
                close()
            }
        }.also { _Balloon = it}
