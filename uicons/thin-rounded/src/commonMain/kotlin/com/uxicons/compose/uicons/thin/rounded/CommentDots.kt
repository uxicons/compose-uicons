package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentDots: ImageVector? = null

val Icons.Tr.CommentDots: ImageVector
    get() = _CommentDots ?: UXIcon(name = "CommentDots") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(17f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(7f, 11f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 12.36f)
                verticalLineToRelative(6.96f)
                curveToRelative(0f, 2.58f, -2.1f, 4.68f, -4.68f, 4.68f)
                horizontalLineToRelative(-6.19f)
                curveTo(6.1f, 24f, 0.47f, 19.21f, 0.03f, 12.86f)
                curveToRelative(-0.24f, -3.48f, 1.03f, -6.88f, 3.48f, -9.33f)
                curveTo(5.96f, 1.06f, 9.36f, -0.2f, 12.84f, 0.03f)
                curveToRelative(6.26f, 0.42f, 11.16f, 5.84f, 11.16f, 12.33f)
                close()
                moveTo(23f, 12.36f)
                curveToRelative(0f, -5.96f, -4.49f, -10.94f, -10.23f, -11.33f)
                curveToRelative(-0.25f, -0.02f, -0.5f, -0.03f, -0.75f, -0.03f)
                curveToRelative(-2.92f, 0f, -5.73f, 1.15f, -7.8f, 3.23f)
                curveTo(1.97f, 6.48f, 0.81f, 9.6f, 1.03f, 12.79f)
                curveToRelative(0.41f, 5.92f, 5.5f, 10.21f, 12.11f, 10.21f)
                horizontalLineToRelative(6.19f)
                curveToRelative(2.03f, 0f, 3.68f, -1.65f, 3.68f, -3.68f)
                verticalLineToRelative(-6.96f)
                close()
            }
        }.also { _CommentDots = it}
