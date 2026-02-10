package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentDots: ImageVector? = null

val Icons.Rc.CommentDots: ImageVector
    get() = _CommentDots ?: UXIcon(name = "CommentDots") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(16f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(8f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 3.44f, -0.48f, 9.33f, -0.5f, 9.58f)
                curveToRelative(-0.04f, 0.49f, -0.42f, 0.87f, -0.91f, 0.91f)
                curveToRelative(-0.24f, 0.02f, -5.88f, 0.5f, -9.59f, 0.5f)
                curveToRelative(-7.71f, 0f, -11f, -3.29f, -11f, -11f)
                reflectiveCurveToRelative(3.29f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 3.29f, 11f, 11f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -6.56f, -2.44f, -9f, -9f, -9f)
                reflectiveCurveToRelative(-9f, 2.44f, -9f, 9f)
                reflectiveCurveToRelative(2.44f, 9f, 9f, 9f)
                curveToRelative(2.79f, 0f, 6.83f, -0.29f, 8.57f, -0.43f)
                curveToRelative(0.14f, -1.78f, 0.43f, -5.97f, 0.43f, -8.57f)
                close()
            }
        }.also { _CommentDots = it}
