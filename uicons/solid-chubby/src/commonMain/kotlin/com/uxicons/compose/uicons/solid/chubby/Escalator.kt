package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Escalator: ImageVector? = null

val Icons.Sc.Escalator: ImageVector
    get() = _Escalator ?: UXIcon(name = "Escalator") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 3f)
                curveToRelative(0f, 1.43f, -0.57f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.57f, -2f, -2f)
                reflectiveCurveToRelative(0.57f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.57f, 2f, 2f)
                close()
                moveTo(18.4f, 13f)
                horizontalLineToRelative(0.6f)
                curveToRelative(2.62f, 0f, 4f, -1.38f, 4f, -4f)
                reflectiveCurveToRelative(-1.38f, -4f, -4f, -4f)
                curveToRelative(-2.45f, 0f, -3.58f, 0.68f, -13.4f, 10f)
                horizontalLineToRelative(-0.6f)
                curveToRelative(-2.62f, 0f, -4f, 1.38f, -4f, 4f)
                curveToRelative(0f, 2.65f, 1.3f, 4f, 3.87f, 4f)
                curveToRelative(2.49f, 0f, 3.85f, -0.81f, 13.53f, -10f)
                close()
                moveTo(10.71f, 7.53f)
                curveToRelative(-0.39f, -0.85f, -1.23f, -1.45f, -2.21f, -1.51f)
                curveToRelative(-0.34f, -0.02f, -0.68f, -0.02f, -1.02f, 0f)
                curveToRelative(-1.29f, 0.08f, -2.34f, 1.1f, -2.44f, 2.38f)
                curveToRelative(-0.02f, 0.29f, -0.04f, 0.6f, -0.04f, 0.93f)
                verticalLineToRelative(3.49f)
                curveToRelative(2.35f, -2.22f, 4.2f, -3.95f, 5.71f, -5.29f)
                close()
            }
        }.also { _Escalator = it}
