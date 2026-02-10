package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Interrogation: ImageVector? = null

val Icons.Rc.Interrogation: ImageVector
    get() = _Interrogation ?: UXIcon(name = "Interrogation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.01f, 23f)
                curveToRelative(-7.25f, 0f, -11.01f, -4.19f, -11.01f, -11.02f)
                curveTo(1f, 4.84f, 4.93f, 1.04f, 11.99f, 1f)
                curveToRelative(6.98f, 0.04f, 10.88f, 3.95f, 11.01f, 10.98f)
                curveToRelative(-0.13f, 7.28f, -3.83f, 10.97f, -10.99f, 11.02f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0.12f, 6.11f, 2.98f, 8.96f, 9.01f, 9f)
                curveToRelative(6.02f, -0.04f, 8.88f, -2.9f, 8.99f, -9.02f)
                curveToRelative(-0.1f, -5.91f, -3.13f, -8.94f, -9.01f, -8.98f)
                curveToRelative(-5.93f, 0.04f, -8.88f, 2.98f, -8.99f, 9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 15f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.41f)
                curveToRelative(0f, -0.55f, 0.44f, -1.0f, 0.99f, -1f)
                curveToRelative(1.49f, -0.01f, 2.08f, -0.6f, 2.11f, -2.12f)
                curveToRelative(-0.03f, -1.44f, -0.66f, -2.07f, -2.11f, -2.08f)
                curveToRelative(-1.46f, 0.01f, -2.07f, 0.62f, -2.1f, 2.12f)
                curveToRelative(-0.01f, 0.55f, -0.5f, 0.98f, -1.02f, 0.98f)
                curveToRelative(-0.55f, -0.01f, -0.99f, -0.47f, -0.98f, -1.02f)
                curveToRelative(0.05f, -2.58f, 1.54f, -4.07f, 4.09f, -4.08f)
                curveToRelative(2.53f, 0.02f, 4.06f, 1.54f, 4.11f, 4.08f)
                curveToRelative(-0.04f, 2.29f, -1.13f, 3.69f, -3.1f, 4.03f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
            }
        }.also { _Interrogation = it}
