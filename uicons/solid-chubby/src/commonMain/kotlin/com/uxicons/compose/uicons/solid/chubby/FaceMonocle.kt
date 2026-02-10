package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceMonocle: ImageVector? = null

val Icons.Sc.FaceMonocle: ImageVector
    get() = _FaceMonocle ?: UXIcon(name = "FaceMonocle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 8f)
                curveToRelative(-1.94f, 0f, -2.5f, 0.56f, -2.5f, 2.5f)
                reflectiveCurveToRelative(0.56f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -0.56f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-0.56f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(15.5f, 11.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                curveToRelative(1.94f, 0f, 3.6f, -0.21f, 5f, -0.65f)
                verticalLineToRelative(-7.52f)
                curveToRelative(-0.45f, 0.1f, -0.94f, 0.16f, -1.5f, 0.16f)
                curveToRelative(-3.07f, 0f, -4.5f, -1.43f, -4.5f, -4.5f)
                reflectiveCurveToRelative(1.43f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 1.43f, 4.5f, 4.5f)
                curveToRelative(0f, 1.46f, -0.33f, 2.53f, -1f, 3.27f)
                verticalLineToRelative(7.69f)
                curveToRelative(2.75f, -1.66f, 4f, -4.72f, 4f, -9.46f)
                curveToRelative(0f, -7.71f, -3.29f, -11f, -11f, -11f)
                close()
                moveTo(7.5f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(13.83f, 17.45f)
                curveToRelative(0.31f, 0.46f, 0.18f, 1.08f, -0.28f, 1.39f)
                curveToRelative(-0.45f, 0.3f, -1.08f, 0.19f, -1.39f, -0.28f)
                curveToRelative(-1.0f, -1.5f, -2.44f, -2.35f, -4.26f, -2.52f)
                curveToRelative(-0.55f, -0.05f, -0.95f, -0.54f, -0.9f, -1.09f)
                curveToRelative(0.05f, -0.55f, 0.53f, -0.95f, 1.09f, -0.9f)
                curveToRelative(2.42f, 0.23f, 4.41f, 1.4f, 5.74f, 3.4f)
                close()
            }
        }.also { _FaceMonocle = it}
