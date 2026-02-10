package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AnglesUpDown: ImageVector? = null

val Icons.Tr.AnglesUpDown: ImageVector
    get() = _AnglesUpDown ?: UXIcon(name = "AnglesUpDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.15f, 9.35f)
                curveToRelative(-0.19f, -0.2f, -0.19f, -0.51f, 0.0f, -0.71f)
                lineTo(10.11f, 0.78f)
                curveToRelative(0.5f, -0.5f, 1.18f, -0.78f, 1.89f, -0.78f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.71f, 0.0f, 1.39f, 0.28f, 1.89f, 0.78f)
                lineToRelative(7.96f, 7.86f)
                curveToRelative(0.2f, 0.19f, 0.2f, 0.51f, 0.0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                curveToRelative(-0.13f, 0f, -0.25f, -0.05f, -0.35f, -0.14f)
                lineTo(13.19f, 1.49f)
                curveToRelative(-0.32f, -0.32f, -0.74f, -0.49f, -1.19f, -0.49f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.45f, 0f, -0.87f, 0.17f, -1.19f, 0.49f)
                lineToRelative(-7.96f, 7.87f)
                curveToRelative(-0.2f, 0.19f, -0.51f, 0.19f, -0.71f, -0.0f)
                close()
                moveTo(21.15f, 14.64f)
                lineToRelative(-7.96f, 7.87f)
                curveToRelative(-0.32f, 0.32f, -0.74f, 0.49f, -1.19f, 0.49f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.45f, 0f, -0.87f, -0.17f, -1.19f, -0.49f)
                lineToRelative(-7.96f, -7.87f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.19f, -0.71f, 0.0f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.0f, 0.71f)
                lineToRelative(7.96f, 7.86f)
                curveToRelative(0.51f, 0.5f, 1.18f, 0.78f, 1.89f, 0.78f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.71f, 0f, 1.39f, -0.28f, 1.89f, -0.78f)
                lineToRelative(7.96f, -7.86f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.0f, -0.71f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.0f)
                close()
            }
        }.also { _AnglesUpDown = it}
