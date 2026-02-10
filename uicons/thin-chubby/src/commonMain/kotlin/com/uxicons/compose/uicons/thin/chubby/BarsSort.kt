package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarsSort: ImageVector? = null

val Icons.Tc.BarsSort: ImageVector
    get() = _BarsSort ?: UXIcon(name = "BarsSort") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.99f, 3.31f)
                curveToRelative(-0.04f, 0.28f, -0.31f, 0.46f, -0.57f, 0.41f)
                curveToRelative(-0.05f, -0.01f, -4.63f, -0.73f, -10.42f, -0.73f)
                reflectiveCurveToRelative(-10.38f, 0.72f, -10.42f, 0.73f)
                curveToRelative(-0.27f, 0.04f, -0.53f, -0.14f, -0.57f, -0.41f)
                curveToRelative(-0.04f, -0.27f, 0.14f, -0.53f, 0.41f, -0.57f)
                curveToRelative(0.05f, -0.01f, 4.7f, -0.74f, 10.58f, -0.74f)
                reflectiveCurveToRelative(10.53f, 0.73f, 10.58f, 0.74f)
                curveToRelative(0.27f, 0.04f, 0.46f, 0.3f, 0.41f, 0.57f)
                close()
                moveTo(16.57f, 12.04f)
                curveToRelative(-5.09f, -0.72f, -10.05f, -0.72f, -15.14f, 0f)
                curveToRelative(-0.27f, 0.04f, -0.46f, 0.29f, -0.42f, 0.56f)
                curveToRelative(0.04f, 0.27f, 0.28f, 0.46f, 0.56f, 0.42f)
                curveToRelative(4.99f, -0.7f, 9.87f, -0.7f, 14.86f, 0f)
                curveToRelative(0.27f, 0.04f, 0.53f, -0.15f, 0.56f, -0.42f)
                curveToRelative(0.04f, -0.27f, -0.15f, -0.53f, -0.42f, -0.56f)
                close()
                moveTo(10.55f, 21.23f)
                curveToRelative(-3.07f, -0.3f, -6.03f, -0.3f, -9.1f, 0f)
                curveToRelative(-0.27f, 0.03f, -0.48f, 0.27f, -0.45f, 0.55f)
                reflectiveCurveToRelative(0.28f, 0.47f, 0.55f, 0.45f)
                curveToRelative(3.0f, -0.29f, 5.9f, -0.29f, 8.9f, 0f)
                curveToRelative(0.27f, 0.03f, 0.52f, -0.17f, 0.55f, -0.45f)
                curveToRelative(0.03f, -0.27f, -0.17f, -0.52f, -0.45f, -0.55f)
                close()
            }
        }.also { _BarsSort = it}
