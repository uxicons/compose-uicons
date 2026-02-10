package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReplyAll: ImageVector? = null

val Icons.Tr.ReplyAll: ImageVector
    get() = _ReplyAll ?: UXIcon(name = "ReplyAll") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 8f)
                horizontalLineTo(6.74f)
                curveToRelative(0.07f, -0.2f, 0.18f, -0.39f, 0.34f, -0.54f)
                lineTo(13.67f, 0.86f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                lineTo(6.37f, 6.75f)
                curveToRelative(-0.47f, 0.47f, -0.72f, 1.09f, -0.72f, 1.75f)
                reflectiveCurveToRelative(0.26f, 1.28f, 0.72f, 1.75f)
                lineToRelative(6.59f, 6.59f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-6.59f, -6.59f)
                curveToRelative(-0.15f, -0.15f, -0.27f, -0.34f, -0.34f, -0.54f)
                horizontalLineToRelative(12.76f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineTo(12.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.73f, 10.26f)
                curveToRelative(-0.47f, -0.47f, -0.73f, -1.1f, -0.73f, -1.77f)
                reflectiveCurveToRelative(0.26f, -1.3f, 0.73f, -1.77f)
                lineTo(7.6f, 0.86f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                lineTo(1.03f, 6.02f)
                curveTo(0.37f, 6.68f, 0.0f, 7.56f, 0.0f, 8.49f)
                reflectiveCurveToRelative(0.36f, 1.81f, 1.02f, 2.48f)
                lineToRelative(5.87f, 5.87f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                lineTo(1.73f, 10.26f)
                close()
            }
        }.also { _ReplyAll = it}
