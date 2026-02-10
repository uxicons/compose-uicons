package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashCheck: ImageVector? = null

val Icons.Tr.TrashCheck: ImageVector
    get() = _TrashCheck ?: UXIcon(name = "TrashCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.1f, 10.15f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.52f, -0.01f, 0.71f)
                lineToRelative(-4.58f, 4.41f)
                curveToRelative(-0.48f, 0.48f, -1.12f, 0.73f, -1.76f, 0.73f)
                reflectiveCurveToRelative(-1.28f, -0.24f, -1.77f, -0.73f)
                lineToRelative(-1.93f, -1.79f)
                curveToRelative(-0.2f, -0.19f, -0.21f, -0.51f, -0.03f, -0.71f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.21f, 0.71f, -0.03f)
                lineToRelative(1.94f, 1.81f)
                curveToRelative(0.6f, 0.6f, 1.55f, 0.6f, 2.13f, 0.01f)
                lineToRelative(4.59f, -4.42f)
                curveToRelative(0.2f, -0.19f, 0.52f, -0.19f, 0.71f, 0.01f)
                close()
                moveTo(23.06f, 4.5f)
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
                moveTo(7.59f, 4f)
                horizontalLineToRelative(8.93f)
                curveToRelative(-0.24f, -1.69f, -1.7f, -3f, -3.46f, -3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.76f, 0f, -3.22f, 1.31f, -3.46f, 3f)
                close()
                moveTo(20.06f, 5f)
                lineTo(4.06f, 5f)
                lineToRelative(1.39f, 14.83f)
                curveToRelative(0.17f, 1.81f, 1.67f, 3.17f, 3.48f, 3.17f)
                horizontalLineToRelative(6.27f)
                curveToRelative(1.82f, 0f, 3.32f, -1.37f, 3.48f, -3.18f)
                lineToRelative(1.37f, -14.82f)
                close()
            }
        }.also { _TrashCheck = it}
