package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Feather: ImageVector? = null

val Icons.Sc.Feather: ImageVector
    get() = _Feather ?: UXIcon(name = "Feather") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.34f, 13.28f)
                lineToRelative(4.17f, -4.23f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.4f, 1.42f, -0.01f)
                reflectiveCurveToRelative(0.4f, 1.02f, 0.01f, 1.42f)
                lineToRelative(-2.29f, 2.33f)
                horizontalLineToRelative(9.3f)
                curveToRelative(1.32f, -3.81f, 1.32f, -7.75f, -0.86f, -9.96f)
                curveToRelative(-1.17f, -1.19f, -2.89f, -1.81f, -4.97f, -1.81f)
                curveToRelative(-2.11f, 0f, -4.51f, 0.64f, -6.76f, 1.72f)
                verticalLineTo(13.28f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.66f, 14.78f)
                lineToRelative(-5.23f, 5.3f)
                lineToRelative(-1.43f, -1.4f)
                lineToRelative(3.34f, -3.38f)
                verticalLineTo(3.83f)
                curveToRelative(-1.16f, 0.73f, -2.24f, 1.58f, -3.16f, 2.52f)
                curveToRelative(-3.79f, 3.84f, -3.85f, 8.2f, -0.23f, 12.36f)
                lineToRelative(-2.49f, 2.55f)
                curveToRelative(-0.39f, 0.4f, -0.38f, 1.03f, 0.02f, 1.42f)
                curveToRelative(0.2f, 0.19f, 0.45f, 0.28f, 0.7f, 0.28f)
                curveToRelative(0.26f, 0f, 0.52f, -0.1f, 0.71f, -0.3f)
                lineToRelative(2.51f, -2.48f)
                curveToRelative(1.99f, 1.78f, 4.03f, 2.69f, 6.08f, 2.69f)
                curveToRelative(2.13f, 0f, 4.19f, -0.99f, 6.11f, -2.94f)
                curveToRelative(1.4f, -1.43f, 2.62f, -3.22f, 3.53f, -5.14f)
                horizontalLineTo(10.66f)
                close()
            }
        }.also { _Feather = it}
