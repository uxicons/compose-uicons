package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashXmark: ImageVector? = null

val Icons.Tr.TrashXmark: ImageVector
    get() = _TrashXmark ?: UXIcon(name = "TrashXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.85f, 10.85f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(3.15f, 3.15f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineToRelative(-3.15f, -3.15f)
                lineToRelative(-3.15f, 3.15f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(-3.15f, -3.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(0.51f, -0.2f, 0.71f, 0f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(3.15f, -3.15f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, 0.51f, 0f, 0.71f)
                close()
                moveTo(23f, 4.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(0f, 0.01f, 0f, 0.03f, -0.0f, 0.05f)
                lineToRelative(-1.37f, 14.87f)
                curveToRelative(-0.21f, 2.33f, -2.14f, 4.09f, -4.48f, 4.09f)
                horizontalLineToRelative(-6.27f)
                curveToRelative(-2.34f, 0f, -4.26f, -1.75f, -4.48f, -4.08f)
                lineToRelative(-1.39f, -14.87f)
                curveToRelative(-0.0f, -0.02f, -0.0f, -0.03f, -0.0f, -0.05f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5.03f)
                curveToRelative(0.25f, -2.25f, 2.16f, -4f, 4.47f, -4f)
                horizontalLineToRelative(2f)
                curveToRelative(2.31f, 0f, 4.22f, 1.75f, 4.47f, 4f)
                horizontalLineToRelative(5.03f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(7.54f, 4f)
                horizontalLineToRelative(8.93f)
                curveToRelative(-0.24f, -1.69f, -1.7f, -3f, -3.46f, -3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.76f, 0f, -3.22f, 1.31f, -3.46f, 3f)
                close()
                moveTo(20.0f, 5f)
                lineTo(4.0f, 5f)
                lineToRelative(1.39f, 14.83f)
                curveToRelative(0.17f, 1.81f, 1.67f, 3.17f, 3.48f, 3.17f)
                horizontalLineToRelative(6.27f)
                curveToRelative(1.82f, 0f, 3.32f, -1.37f, 3.48f, -3.18f)
                lineToRelative(1.37f, -14.82f)
                close()
            }
        }.also { _TrashXmark = it}
