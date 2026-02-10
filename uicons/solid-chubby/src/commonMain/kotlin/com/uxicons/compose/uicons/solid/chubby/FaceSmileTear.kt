package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSmileTear: ImageVector? = null

val Icons.Sc.FaceSmileTear: ImageVector
    get() = _FaceSmileTear ?: UXIcon(name = "FaceSmileTear") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(8.5f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(11.0f, 16.96f)
                curveToRelative(-1.47f, -0.09f, -2.67f, -0.5f, -3.52f, -1.17f)
                curveToRelative(-0.44f, -0.34f, -0.51f, -0.97f, -0.17f, -1.4f)
                curveToRelative(0.34f, -0.44f, 0.97f, -0.51f, 1.4f, -0.17f)
                curveToRelative(0.54f, 0.42f, 1.31f, 0.67f, 2.38f, 0.75f)
                curveToRelative(0.55f, 0.04f, 0.96f, 0.53f, 0.92f, 1.08f)
                curveToRelative(-0.04f, 0.52f, -0.48f, 0.92f, -1.0f, 0.92f)
                close()
                moveTo(15.5f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(16f, 17f)
                curveToRelative(-1.43f, 0f, -2f, -0.57f, -2f, -2f)
                curveToRelative(0f, -1.05f, 0.83f, -2.24f, 1.42f, -2.95f)
                curveToRelative(0.3f, -0.37f, 0.86f, -0.36f, 1.16f, 0.0f)
                curveToRelative(0.59f, 0.72f, 1.42f, 1.92f, 1.42f, 2.95f)
                curveToRelative(0f, 1.43f, -0.57f, 2f, -2f, 2f)
                close()
            }
        }.also { _FaceSmileTear = it}
