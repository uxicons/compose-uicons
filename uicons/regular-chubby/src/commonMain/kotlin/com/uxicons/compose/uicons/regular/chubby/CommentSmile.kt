package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentSmile: ImageVector? = null

val Icons.Rc.CommentSmile: ImageVector
    get() = _CommentSmile ?: UXIcon(name = "CommentSmile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                curveToRelative(3.7f, 0f, 9.35f, -0.48f, 9.59f, -0.5f)
                curveToRelative(0.48f, -0.04f, 0.87f, -0.43f, 0.91f, -0.91f)
                curveToRelative(0.02f, -0.25f, 0.5f, -6.14f, 0.5f, -9.58f)
                curveToRelative(0f, -7.71f, -3.29f, -11f, -11f, -11f)
                close()
                moveTo(20.57f, 20.57f)
                curveToRelative(-1.74f, 0.14f, -5.79f, 0.43f, -8.57f, 0.43f)
                curveToRelative(-6.56f, 0f, -9f, -2.44f, -9f, -9f)
                reflectiveCurveToRelative(2.44f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 2.44f, 9f, 9f)
                curveToRelative(0f, 2.6f, -0.29f, 6.79f, -0.43f, 8.57f)
                close()
                moveTo(8f, 10f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(14f, 10f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(16.7f, 14.38f)
                curveToRelative(0.34f, 0.44f, 0.26f, 1.06f, -0.17f, 1.4f)
                curveToRelative(-1.06f, 0.83f, -2.5f, 1.21f, -4.52f, 1.21f)
                reflectiveCurveToRelative(-3.46f, -0.39f, -4.52f, -1.21f)
                curveToRelative(-0.44f, -0.34f, -0.51f, -0.97f, -0.17f, -1.4f)
                curveToRelative(0.34f, -0.43f, 0.97f, -0.51f, 1.4f, -0.17f)
                curveToRelative(0.68f, 0.53f, 1.76f, 0.79f, 3.29f, 0.79f)
                reflectiveCurveToRelative(2.61f, -0.26f, 3.29f, -0.79f)
                curveToRelative(0.44f, -0.34f, 1.06f, -0.26f, 1.4f, 0.17f)
                close()
            }
        }.also { _CommentSmile = it}
