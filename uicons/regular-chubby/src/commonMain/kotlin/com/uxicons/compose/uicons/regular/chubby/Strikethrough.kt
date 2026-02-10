package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Strikethrough: ImageVector? = null

val Icons.Rc.Strikethrough: ImageVector
    get() = _Strikethrough ?: UXIcon(name = "Strikethrough") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-20f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6.85f)
                curveToRelative(-1.42f, -1.0f, -2.35f, -2.64f, -2.35f, -4.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                curveToRelative(2.1f, 0f, 3.99f, 1.17f, 4.93f, 3.06f)
                curveToRelative(0.25f, 0.49f, 0.04f, 1.09f, -0.45f, 1.34f)
                curveToRelative(-0.5f, 0.25f, -1.09f, 0.04f, -1.34f, -0.45f)
                curveToRelative(-0.6f, -1.2f, -1.8f, -1.95f, -3.14f, -1.95f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.23f, 0f, 2.42f, 0.35f, 3.45f, 1f)
                horizontalLineToRelative(6.55f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(17.39f, 15.0f)
                curveToRelative(-0.55f, 0.05f, -0.96f, 0.53f, -0.91f, 1.08f)
                curveToRelative(0.01f, 0.14f, 0.02f, 0.27f, 0.02f, 0.41f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                curveToRelative(-1.87f, 0f, -3.52f, -1.12f, -4.19f, -2.86f)
                curveToRelative(-0.2f, -0.52f, -0.78f, -0.77f, -1.29f, -0.57f)
                curveToRelative(-0.52f, 0.2f, -0.77f, 0.78f, -0.57f, 1.29f)
                curveToRelative(0.98f, 2.51f, 3.36f, 4.14f, 6.06f, 4.14f)
                curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
                curveToRelative(0f, -0.2f, -0.01f, -0.4f, -0.03f, -0.59f)
                curveToRelative(-0.05f, -0.55f, -0.52f, -0.95f, -1.08f, -0.91f)
                close()
            }
        }.also { _Strikethrough = it}
