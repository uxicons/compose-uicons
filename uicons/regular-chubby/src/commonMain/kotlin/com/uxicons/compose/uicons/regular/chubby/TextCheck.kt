package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextCheck: ImageVector? = null

val Icons.Rc.TextCheck: ImageVector
    get() = _TextCheck ?: UXIcon(name = "TextCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.47f, 12.7f)
                curveToRelative(-0.49f, -0.26f, -1.09f, -0.07f, -1.35f, 0.41f)
                curveToRelative(-0.01f, 0.02f, -1.1f, 2.03f, -3.15f, 4.09f)
                curveToRelative(-1.44f, 1.45f, -2.88f, 2.42f, -3.61f, 2.87f)
                curveToRelative(-0.75f, -0.47f, -2.24f, -1.49f, -3.62f, -2.87f)
                curveToRelative(-0.35f, -0.35f, -0.68f, -0.71f, -0.98f, -1.07f)
                curveToRelative(-0.36f, -0.42f, -0.99f, -0.47f, -1.41f, -0.11f)
                curveToRelative(-0.42f, 0.36f, -0.47f, 0.99f, -0.11f, 1.41f)
                curveToRelative(0.33f, 0.39f, 0.7f, 0.79f, 1.09f, 1.18f)
                curveToRelative(2.13f, 2.13f, 4.44f, 3.44f, 4.54f, 3.5f)
                curveToRelative(0.15f, 0.09f, 0.32f, 0.13f, 0.49f, 0.13f)
                curveToRelative(0.16f, 0f, 0.33f, -0.04f, 0.47f, -0.12f)
                curveToRelative(0.09f, -0.05f, 2.3f, -1.25f, 4.56f, -3.51f)
                curveToRelative(2.28f, -2.28f, 3.45f, -4.47f, 3.5f, -4.57f)
                curveToRelative(0.26f, -0.49f, 0.07f, -1.09f, -0.41f, -1.35f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.96f, 12.28f)
                curveToRelative(0.31f, 0.96f, 0.62f, 2.01f, 0.92f, 3.17f)
                curveToRelative(0.12f, 0.45f, 0.52f, 0.75f, 0.97f, 0.75f)
                curveToRelative(0.08f, 0f, 0.17f, -0.01f, 0.25f, -0.03f)
                curveToRelative(0.53f, -0.14f, 0.86f, -0.68f, 0.72f, -1.22f)
                curveTo(12.28f, 5.11f, 8.92f, 2.26f, 8.54f, 1.97f)
                curveToRelative(-0.36f, -0.28f, -0.85f, -0.28f, -1.22f, -0.01f)
                curveToRelative(-0.15f, 0.11f, -3.68f, 2.85f, -6.29f, 12.99f)
                curveToRelative(-0.14f, 0.54f, 0.18f, 1.08f, 0.72f, 1.22f)
                curveToRelative(0.53f, 0.14f, 1.08f, -0.18f, 1.22f, -0.72f)
                curveToRelative(0.3f, -1.16f, 0.61f, -2.21f, 0.92f, -3.17f)
                horizontalLineTo(11.96f)
                close()
                moveTo(7.92f, 4.18f)
                curveToRelative(0.73f, 0.86f, 2.01f, 2.7f, 3.33f, 6.1f)
                horizontalLineTo(4.6f)
                curveToRelative(1.31f, -3.4f, 2.6f, -5.24f, 3.32f, -6.1f)
                close()
            }
        }.also { _TextCheck = it}
