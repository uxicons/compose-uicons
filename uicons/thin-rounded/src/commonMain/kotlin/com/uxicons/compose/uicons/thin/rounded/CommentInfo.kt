package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentInfo: ImageVector? = null

val Icons.Tr.CommentInfo: ImageVector
    get() = _CommentInfo ?: UXIcon(name = "CommentInfo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 19.5f)
                verticalLineToRelative(-7.14f)
                curveTo(24f, 5.87f, 19.1f, 0.45f, 12.84f, 0.03f)
                curveToRelative(-3.47f, -0.24f, -6.88f, 1.04f, -9.33f, 3.49f)
                curveTo(1.06f, 5.98f, -0.21f, 9.38f, 0.03f, 12.85f)
                curveToRelative(0.44f, 6.35f, 6.07f, 11.15f, 13.1f, 11.15f)
                horizontalLineToRelative(6.37f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                close()
                moveTo(12.77f, 1.03f)
                curveToRelative(5.74f, 0.39f, 10.23f, 5.37f, 10.23f, 11.33f)
                verticalLineToRelative(7.14f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-6.37f)
                curveToRelative(-6.6f, 0f, -11.7f, -4.3f, -12.11f, -10.21f)
                curveToRelative(-0.22f, -3.19f, 0.94f, -6.31f, 3.19f, -8.56f)
                curveToRelative(2.07f, -2.07f, 4.88f, -3.23f, 7.8f, -3.23f)
                curveToRelative(0.25f, 0f, 0.5f, 0.01f, 0.75f, 0.03f)
                close()
                moveTo(13f, 18.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                close()
            }
        }.also { _CommentInfo = it}
