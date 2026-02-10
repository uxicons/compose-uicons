package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiaryClasp: ImageVector? = null

val Icons.Sc.DiaryClasp: ImageVector
    get() = _DiaryClasp ?: UXIcon(name = "DiaryClasp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 16f)
                curveToRelative(-0.7f, 0f, -1.8f, 0.26f, -2.73f, 0.98f)
                curveToRelative(-0.14f, -1.47f, -0.27f, -3.23f, -0.27f, -4.98f)
                curveToRelative(0f, -2.48f, 0.24f, -4.98f, 0.45f, -6.65f)
                curveToRelative(0.24f, -1.93f, 1.66f, -3.45f, 3.55f, -3.85f)
                verticalLineToRelative(14.49f)
                close()
                moveTo(6f, 18f)
                curveToRelative(-0.18f, 0.0f, -1.73f, 0.1f, -2.29f, 1.67f)
                curveToRelative(0.55f, 1.47f, 1.81f, 2.57f, 3.42f, 2.86f)
                curveToRelative(1.77f, 0.31f, 3.4f, 0.47f, 4.87f, 0.47f)
                curveToRelative(3.65f, 0f, 7.31f, -0.99f, 7.46f, -1.04f)
                curveToRelative(0.37f, -0.1f, 0.65f, -0.41f, 0.72f, -0.79f)
                curveToRelative(0.02f, -0.1f, 0.23f, -1.36f, 0.44f, -3.17f)
                close()
                moveTo(15.14f, 9f)
                curveToRelative(0f, -1.99f, 1.01f, -3f, 3f, -3f)
                horizontalLineToRelative(2.49f)
                curveToRelative(-0.21f, -1.81f, -0.42f, -3.08f, -0.44f, -3.17f)
                curveToRelative(-0.07f, -0.38f, -0.35f, -0.69f, -0.72f, -0.79f)
                curveToRelative(-0.15f, -0.04f, -3.82f, -1.04f, -7.46f, -1.04f)
                curveToRelative(-1.18f, 0f, -2.19f, 0.08f, -3f, 0.17f)
                verticalLineToRelative(14.83f)
                horizontalLineToRelative(11.82f)
                curveToRelative(0.1f, -1.25f, 0.18f, -2.63f, 0.18f, -4f)
                horizontalLineToRelative(-2.86f)
                curveToRelative(-1.99f, 0f, -3f, -1.01f, -3f, -3f)
                close()
                moveTo(17.14f, 9f)
                curveToRelative(0f, 0.88f, 0.12f, 1f, 1f, 1f)
                horizontalLineToRelative(2.81f)
                curveToRelative(-0.03f, -0.69f, -0.07f, -1.36f, -0.13f, -2f)
                horizontalLineToRelative(-2.68f)
                curveToRelative(-0.88f, 0f, -1f, 0.12f, -1f, 1f)
                close()
            }
        }.also { _DiaryClasp = it}
