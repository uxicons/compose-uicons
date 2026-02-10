package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltRight: ImageVector? = null

val Icons.Tc.ArrowAltRight: ImageVector
    get() = _ArrowAltRight ?: UXIcon(name = "ArrowAltRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.5f, 12.5f)
                horizontalLineTo(13.66f)
                curveToRelative(0.15f, 2.43f, 1.28f, 4.63f, 1.33f, 4.73f)
                curveToRelative(0.11f, 0.21f, 0.34f, 0.32f, 0.57f, 0.25f)
                curveToRelative(4.52f, -1.21f, 7.24f, -5.03f, 7.34f, -5.2f)
                curveToRelative(0.22f, -0.34f, -0.02f, -0.6f, -0.02f, -0.6f)
                curveToRelative(-0.49f, -0.66f, -3.15f, -3.99f, -7.41f, -5.16f)
                curveToRelative(-0.04f, -0.01f, -0.4f, -0.09f, -0.58f, 0.26f)
                curveToRelative(-0.05f, 0.1f, -1.1f, 2.3f, -1.23f, 4.72f)
                horizontalLineTo(1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(15.62f, 7.6f)
                curveToRelative(3.29f, 1.05f, 5.49f, 3.46f, 6.25f, 4.4f)
                curveToRelative(-0.68f, 0.86f, -2.9f, 3.38f, -6.16f, 4.4f)
                curveToRelative(-0.34f, -0.76f, -1.05f, -2.59f, -1.06f, -4.41f)
                curveToRelative(-0.01f, -1.8f, 0.65f, -3.61f, 0.97f, -4.39f)
                close()
            }
        }.also { _ArrowAltRight = it}
