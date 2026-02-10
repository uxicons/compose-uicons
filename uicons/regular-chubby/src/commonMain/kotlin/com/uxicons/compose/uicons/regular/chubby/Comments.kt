package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comments: ImageVector? = null

val Icons.Rc.Comments: ImageVector
    get() = _Comments ?: UXIcon(name = "Comments") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.27f, 10.38f)
                curveToRelative(-0.17f, -0.52f, -0.43f, -1.01f, -0.75f, -1.45f)
                curveToRelative(-0.33f, -0.45f, -0.95f, -0.54f, -1.4f, -0.22f)
                curveToRelative(-0.45f, 0.33f, -0.54f, 0.95f, -0.22f, 1.4f)
                curveToRelative(0.2f, 0.28f, 0.36f, 0.58f, 0.47f, 0.91f)
                curveToRelative(0.4f, 1.21f, 0.61f, 2.42f, 0.61f, 3.63f)
                curveToRelative(0f, 1.88f, -0.23f, 3.79f, -0.67f, 5.68f)
                curveToRelative(-1.89f, 0.45f, -3.8f, 0.67f, -5.68f, 0.67f)
                curveToRelative(-1.2f, 0f, -2.42f, -0.2f, -3.63f, -0.61f)
                curveToRelative(-0.34f, -0.11f, -0.65f, -0.28f, -0.94f, -0.49f)
                curveToRelative(-0.44f, -0.33f, -1.07f, -0.24f, -1.4f, 0.2f)
                curveToRelative(-0.33f, 0.44f, -0.24f, 1.07f, 0.2f, 1.4f)
                curveToRelative(0.46f, 0.34f, 0.96f, 0.61f, 1.5f, 0.79f)
                curveToRelative(1.41f, 0.47f, 2.85f, 0.71f, 4.26f, 0.71f)
                curveToRelative(2.24f, 0f, 4.52f, -0.29f, 6.76f, -0.88f)
                curveToRelative(0.35f, -0.09f, 0.62f, -0.36f, 0.72f, -0.72f)
                curveToRelative(0.58f, -2.24f, 0.88f, -4.51f, 0.88f, -6.76f)
                curveToRelative(0f, -1.42f, -0.24f, -2.85f, -0.71f, -4.26f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.63f, 16.99f)
                curveToRelative(1.58f, -0.53f, 2.84f, -1.79f, 3.37f, -3.37f)
                curveToRelative(0.95f, -2.83f, 0.95f, -5.7f, 0f, -8.53f)
                curveToRelative(-0.53f, -1.58f, -1.79f, -2.84f, -3.37f, -3.37f)
                curveToRelative(-2.83f, -0.95f, -5.7f, -0.95f, -8.53f, 0f)
                curveToRelative(-1.58f, 0.53f, -2.84f, 1.79f, -3.37f, 3.37f)
                curveToRelative(-0.47f, 1.41f, -0.71f, 2.85f, -0.71f, 4.26f)
                curveToRelative(0f, 2.24f, 0.29f, 4.52f, 0.88f, 6.76f)
                curveToRelative(0.09f, 0.35f, 0.36f, 0.62f, 0.72f, 0.72f)
                curveToRelative(2.24f, 0.58f, 4.51f, 0.88f, 6.76f, 0.88f)
                curveToRelative(1.42f, 0f, 2.85f, -0.24f, 4.26f, -0.71f)
                close()
                moveTo(3.01f, 9.35f)
                curveToRelative(0f, -1.2f, 0.2f, -2.42f, 0.61f, -3.63f)
                horizontalLineToRelative(0f)
                curveToRelative(0.33f, -0.99f, 1.12f, -1.78f, 2.11f, -2.11f)
                curveToRelative(2.41f, -0.81f, 4.85f, -0.81f, 7.26f, 0f)
                curveToRelative(0.99f, 0.33f, 1.78f, 1.12f, 2.11f, 2.11f)
                curveToRelative(0.81f, 2.41f, 0.81f, 4.85f, 0f, 7.25f)
                curveToRelative(-0.33f, 0.99f, -1.12f, 1.78f, -2.11f, 2.11f)
                curveToRelative(-1.21f, 0.41f, -2.43f, 0.61f, -3.63f, 0.61f)
                curveToRelative(-1.88f, 0f, -3.79f, -0.23f, -5.68f, -0.67f)
                curveToRelative(-0.45f, -1.89f, -0.67f, -3.8f, -0.67f, -5.68f)
                close()
            }
        }.also { _Comments = it}
