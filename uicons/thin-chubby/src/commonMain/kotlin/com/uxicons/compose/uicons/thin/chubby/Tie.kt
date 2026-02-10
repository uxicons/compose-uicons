package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tie: ImageVector? = null

val Icons.Tc.Tie: ImageVector
    get() = _Tie ?: UXIcon(name = "Tie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.69f, 5.44f)
                curveToRelative(0.56f, -0.57f, 1.31f, -1.66f, 1.31f, -3.44f)
                curveToRelative(0f, -0.23f, -0.16f, -0.43f, -0.38f, -0.48f)
                curveToRelative(-0.08f, -0.02f, -2.08f, -0.52f, -3.62f, -0.52f)
                reflectiveCurveToRelative(-3.54f, 0.49f, -3.62f, 0.52f)
                curveToRelative(-0.22f, 0.06f, -0.38f, 0.26f, -0.38f, 0.48f)
                curveToRelative(0f, 1.78f, 0.76f, 2.87f, 1.31f, 3.44f)
                curveToRelative(-2.72f, 7.09f, -3.29f, 11.32f, -3.31f, 11.49f)
                curveToRelative(-0.01f, 0.12f, 0.01f, 0.24f, 0.08f, 0.34f)
                curveToRelative(1.52f, 2.32f, 3.42f, 4.22f, 5.65f, 5.65f)
                curveToRelative(0.16f, 0.1f, 0.38f, 0.1f, 0.54f, 0f)
                curveToRelative(2.23f, -1.43f, 4.13f, -3.33f, 5.65f, -5.65f)
                curveToRelative(0.07f, -0.1f, 0.09f, -0.22f, 0.08f, -0.34f)
                curveToRelative(-0.02f, -0.18f, -0.59f, -4.41f, -3.31f, -11.49f)
                close()
                moveTo(9.02f, 2.4f)
                curveToRelative(0.64f, -0.14f, 1.95f, -0.4f, 2.98f, -0.4f)
                reflectiveCurveToRelative(2.34f, 0.25f, 2.98f, 0.4f)
                curveToRelative(-0.12f, 1.58f, -0.98f, 2.37f, -1.29f, 2.6f)
                horizontalLineToRelative(-3.39f)
                curveToRelative(-0.3f, -0.23f, -1.16f, -1.03f, -1.29f, -2.6f)
                close()
                moveTo(12f, 21.9f)
                curveToRelative(-1.95f, -1.3f, -3.62f, -2.98f, -4.98f, -5.02f)
                curveToRelative(0.14f, -0.87f, 0.84f, -4.84f, 3.15f, -10.88f)
                horizontalLineToRelative(3.66f)
                curveToRelative(2.3f, 6.05f, 3.01f, 10.02f, 3.15f, 10.88f)
                curveToRelative(-1.36f, 2.04f, -3.03f, 3.72f, -4.98f, 5.02f)
                close()
            }
        }.also { _Tie = it}
