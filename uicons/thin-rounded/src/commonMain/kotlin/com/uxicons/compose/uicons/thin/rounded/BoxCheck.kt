package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxCheck: ImageVector? = null

val Icons.Tr.BoxCheck: ImageVector
    get() = _BoxCheck ?: UXIcon(name = "BoxCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.82f, 0.39f, 1.54f, 1f, 2.0f)
                horizontalLineToRelative(0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(13f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(23f, 7.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0.61f, -0.46f, 1f, -1.18f, 1f, -2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(22f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(5.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(2f, 7.95f)
                curveToRelative(0.16f, 0.03f, 0.33f, 0.05f, 0.5f, 0.05f)
                lineTo(21.5f, 8f)
                curveToRelative(0.17f, 0f, 0.34f, -0.02f, 0.5f, -0.05f)
                verticalLineToRelative(11.55f)
                close()
                moveTo(23f, 5.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(2.5f, 7f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1f)
                close()
                moveTo(17.37f, 12.16f)
                curveToRelative(0.19f, 0.2f, 0.18f, 0.52f, -0.03f, 0.71f)
                lineToRelative(-4.74f, 4.41f)
                curveToRelative(-0.46f, 0.46f, -1.09f, 0.72f, -1.75f, 0.72f)
                reflectiveCurveToRelative(-1.3f, -0.26f, -1.77f, -0.73f)
                lineToRelative(-2.43f, -2.41f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, -0.0f, -0.71f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, -0.0f)
                lineToRelative(2.43f, 2.41f)
                curveToRelative(0.57f, 0.57f, 1.56f, 0.57f, 2.12f, 0f)
                lineToRelative(4.75f, -4.43f)
                curveToRelative(0.2f, -0.19f, 0.52f, -0.18f, 0.71f, 0.03f)
                close()
            }
        }.also { _BoxCheck = it}
