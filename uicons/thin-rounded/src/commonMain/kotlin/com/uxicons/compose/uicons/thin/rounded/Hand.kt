package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hand: ImageVector? = null

val Icons.Tr.Hand: ImageVector
    get() = _Hand ?: UXIcon(name = "Hand") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.95f, 11.3f)
                lineToRelative(-0.7f, -5f)
                curveToRelative(-0.35f, -2.45f, -2.48f, -4.3f, -4.95f, -4.3f)
                lineTo(4.5f, 2f)
                curveTo(2.02f, 2f, 0f, 4.02f, 0f, 6.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(2.48f)
                lineToRelative(2.77f, 4.39f)
                curveToRelative(1.26f, 2.91f, 5.78f, 1.48f, 5.17f, -1.61f)
                lineToRelative(-0.8f, -2.78f)
                horizontalLineToRelative(4.87f)
                curveToRelative(2.95f, 0.07f, 5.43f, -2.79f, 4.95f, -5.7f)
                close()
                moveTo(4.5f, 16f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(2.5f)
                lineToRelative(0.01f, 13f)
                horizontalLineToRelative(-2.51f)
                close()
                moveTo(22.02f, 14.62f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.76f, 0.88f, -1.86f, 1.38f, -3.02f, 1.38f)
                horizontalLineToRelative(-5.53f)
                curveToRelative(-0.32f, -0.01f, -0.58f, 0.33f, -0.48f, 0.64f)
                lineToRelative(0.97f, 3.36f)
                curveToRelative(0.34f, 1.96f, -2.54f, 2.84f, -3.32f, 0.91f)
                lineToRelative(-2.62f, -4.15f)
                lineToRelative(-0.01f, -13.75f)
                horizontalLineToRelative(10.29f)
                curveToRelative(1.98f, 0f, 3.68f, 1.48f, 3.96f, 3.44f)
                lineToRelative(0.7f, 5f)
                curveToRelative(0.16f, 1.15f, -0.18f, 2.31f, -0.94f, 3.18f)
                close()
            }
        }.also { _Hand = it}
