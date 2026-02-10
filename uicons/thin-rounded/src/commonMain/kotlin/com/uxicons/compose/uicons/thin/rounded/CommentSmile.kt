package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentSmile: ImageVector? = null

val Icons.Tr.CommentSmile: ImageVector
    get() = _CommentSmile ?: UXIcon(name = "CommentSmile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 11.5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(8f, 8.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(16f, 7.5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(16f, 10.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(17.89f, 14.69f)
                curveToRelative(0.17f, 0.21f, 0.14f, 0.53f, -0.07f, 0.7f)
                curveToRelative(-0.11f, 0.09f, -2.64f, 2.11f, -5.82f, 2.11f)
                reflectiveCurveToRelative(-5.71f, -2.02f, -5.82f, -2.11f)
                curveToRelative(-0.21f, -0.17f, -0.25f, -0.49f, -0.07f, -0.7f)
                curveToRelative(0.17f, -0.21f, 0.49f, -0.25f, 0.7f, -0.07f)
                curveToRelative(0.02f, 0.02f, 2.37f, 1.89f, 5.19f, 1.89f)
                reflectiveCurveToRelative(5.16f, -1.87f, 5.19f, -1.89f)
                curveToRelative(0.21f, -0.17f, 0.53f, -0.14f, 0.7f, 0.07f)
                close()
                moveTo(12.84f, 0.03f)
                curveToRelative(-3.47f, -0.23f, -6.88f, 1.04f, -9.33f, 3.49f)
                curveTo(1.06f, 5.98f, -0.21f, 9.38f, 0.03f, 12.86f)
                curveToRelative(0.44f, 6.35f, 6.07f, 11.14f, 13.1f, 11.14f)
                horizontalLineToRelative(6.19f)
                curveToRelative(2.58f, 0f, 4.68f, -2.1f, 4.68f, -4.68f)
                verticalLineToRelative(-6.96f)
                curveTo(24f, 5.87f, 19.1f, 0.45f, 12.84f, 0.03f)
                close()
                moveTo(23f, 19.32f)
                curveToRelative(0f, 2.03f, -1.65f, 3.68f, -3.68f, 3.68f)
                horizontalLineToRelative(-6.19f)
                curveToRelative(-6.6f, 0f, -11.7f, -4.3f, -12.11f, -10.21f)
                curveToRelative(-0.22f, -3.19f, 0.94f, -6.31f, 3.19f, -8.56f)
                curveTo(6.46f, 1.98f, 9.58f, 0.81f, 12.77f, 1.03f)
                curveToRelative(5.74f, 0.39f, 10.23f, 5.37f, 10.23f, 11.33f)
                verticalLineToRelative(6.96f)
                close()
            }
        }.also { _CommentSmile = it}
