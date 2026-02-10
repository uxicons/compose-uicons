package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentCode: ImageVector? = null

val Icons.Sc.CommentCode: ImageVector
    get() = _CommentCode ?: UXIcon(name = "CommentCode") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-5.12f, 0f, -11f, 1.25f, -11f, 11f)
                reflectiveCurveToRelative(5.88f, 11f, 11f, 11f)
                curveToRelative(3.76f, 0f, 7.03f, -0.64f, 9.1f, -1.18f)
                curveToRelative(0.35f, -0.09f, 0.62f, -0.36f, 0.72f, -0.72f)
                curveToRelative(0.79f, -3.02f, 1.18f, -6.08f, 1.18f, -9.1f)
                curveToRelative(0f, -9.75f, -5.88f, -11f, -11f, -11f)
                close()
                moveTo(10.73f, 15.7f)
                curveToRelative(-0.51f, 0.72f, -1.21f, 0.42f, -1.38f, 0.32f)
                curveToRelative(-2.31f, -1.45f, -3.46f, -3.44f, -3.5f, -3.52f)
                curveToRelative(-0.17f, -0.31f, -0.17f, -0.68f, 0f, -0.99f)
                curveToRelative(0.05f, -0.08f, 1.19f, -2.07f, 3.5f, -3.52f)
                curveToRelative(0.47f, -0.29f, 1.08f, -0.15f, 1.38f, 0.32f)
                curveToRelative(0.29f, 0.47f, 0.15f, 1.08f, -0.32f, 1.38f)
                curveToRelative(-1.24f, 0.78f, -2.07f, 1.74f, -2.49f, 2.32f)
                curveToRelative(0.43f, 0.58f, 1.26f, 1.55f, 2.49f, 2.32f)
                curveToRelative(0.47f, 0.29f, 0.64f, 0.93f, 0.32f, 1.38f)
                close()
                moveTo(18.16f, 12.49f)
                curveToRelative(-0.05f, 0.08f, -1.19f, 2.07f, -3.5f, 3.52f)
                curveToRelative(-0.17f, 0.1f, -0.87f, 0.4f, -1.38f, -0.32f)
                curveToRelative(-0.32f, -0.45f, -0.15f, -1.08f, 0.32f, -1.38f)
                curveToRelative(1.23f, -0.77f, 2.07f, -1.75f, 2.49f, -2.32f)
                curveToRelative(-0.42f, -0.57f, -1.25f, -1.54f, -2.49f, -2.32f)
                curveToRelative(-0.47f, -0.29f, -0.61f, -0.91f, -0.32f, -1.38f)
                curveToRelative(0.29f, -0.47f, 0.91f, -0.61f, 1.38f, -0.32f)
                curveToRelative(2.31f, 1.45f, 3.46f, 3.44f, 3.5f, 3.52f)
                curveToRelative(0.17f, 0.31f, 0.17f, 0.68f, 0f, 0.99f)
                close()
            }
        }.also { _CommentCode = it}
