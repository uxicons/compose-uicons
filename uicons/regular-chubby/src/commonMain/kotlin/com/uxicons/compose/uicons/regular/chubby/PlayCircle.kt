package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayCircle: ImageVector? = null

val Icons.Rc.PlayCircle: ImageVector
    get() = _PlayCircle ?: UXIcon(name = "PlayCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.44f, 8.83f)
                curveToRelative(-2.31f, -1.37f, -3.75f, -1.68f, -3.81f, -1.7f)
                curveToRelative(-0.5f, -0.11f, -1.0f, 0.18f, -1.16f, 0.67f)
                curveToRelative(-0.02f, 0.06f, -0.47f, 1.48f, -0.47f, 4.2f)
                reflectiveCurveToRelative(0.45f, 4.14f, 0.47f, 4.2f)
                curveToRelative(0.16f, 0.49f, 0.67f, 0.77f, 1.16f, 0.67f)
                curveToRelative(0.06f, -0.01f, 1.5f, -0.33f, 3.81f, -1.7f)
                curveToRelative(2.17f, -1.28f, 3.13f, -2.31f, 3.31f, -2.51f)
                curveToRelative(0.34f, -0.38f, 0.34f, -0.95f, 0f, -1.33f)
                curveToRelative(-0.17f, -0.19f, -1.14f, -1.22f, -3.31f, -2.51f)
                close()
                moveTo(12.42f, 13.45f)
                curveToRelative(-0.94f, 0.56f, -1.7f, 0.91f, -2.25f, 1.13f)
                curveToRelative(-0.09f, -0.6f, -0.17f, -1.46f, -0.17f, -2.58f)
                reflectiveCurveToRelative(0.08f, -1.99f, 0.17f, -2.58f)
                curveToRelative(0.55f, 0.22f, 1.31f, 0.58f, 2.25f, 1.13f)
                curveToRelative(0.96f, 0.57f, 1.65f, 1.08f, 2.11f, 1.45f)
                curveToRelative(-0.46f, 0.37f, -1.14f, 0.88f, -2.11f, 1.45f)
                close()
                moveTo(12.0f, 1f)
                curveToRelative(-7.71f, 0f, -11.0f, 3.29f, -11.0f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(12.0f, 21f)
                curveToRelative(-6.56f, 0f, -9f, -2.44f, -9f, -9f)
                reflectiveCurveToRelative(2.44f, -9f, 9.0f, -9f)
                reflectiveCurveToRelative(9f, 2.44f, 9f, 9f)
                reflectiveCurveToRelative(-2.44f, 9f, -9f, 9f)
                close()
            }
        }.also { _PlayCircle = it}
