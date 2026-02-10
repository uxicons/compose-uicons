package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InboxIn: ImageVector? = null

val Icons.Br.InboxIn: ImageVector
    get() = _InboxIn ?: UXIcon(name = "InboxIn") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 12f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(3.5f, 12f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(3.0f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-3.0f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21.0f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-3.0f)
            curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(1.71f)
            curveToRelative(0.65f, 2.31f, 2.78f, 4f, 5.29f, 4f)
            horizontalLineToRelative(2.5f)
            curveToRelative(2.51f, 0f, 4.64f, -1.69f, 5.29f, -4f)
            horizontalLineToRelative(2.21f)
            curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
            verticalLineToRelative(3.0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.36f, 11.73f)
            curveToRelative(0.35f, 0.36f, 0.93f, 0.36f, 1.29f, 0f)
            lineToRelative(3.3f, -3.34f)
            curveToRelative(0.51f, -0.52f, 0.14f, -1.39f, -0.58f, -1.39f)
            horizontalLineToRelative(-1.86f)
            verticalLineTo(1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(-1.86f)
            curveToRelative(-0.72f, 0f, -1.09f, 0.87f, -0.58f, 1.39f)
            lineToRelative(3.3f, 3.34f)
            close()
        }
    }.also { _InboxIn = it }
