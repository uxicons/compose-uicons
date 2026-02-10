package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupTogo: ImageVector? = null

val Icons.Sr.CupTogo: ImageVector
    get() = _CupTogo ?: UXIcon(name = "CupTogo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 4f)
                horizontalLineToRelative(-0.49f)
                lineToRelative(-0.17f, -0.82f)
                curveToRelative(-0.39f, -1.85f, -2.02f, -3.18f, -3.92f, -3.18f)
                lineTo(6.58f, 0f)
                curveToRelative(-1.89f, 0f, -3.53f, 1.33f, -3.92f, 3.18f)
                lineToRelative(-0.17f, 0.82f)
                horizontalLineToRelative(-0.49f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(20f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(2.32f, 8f)
                lineToRelative(1.35f, 11.58f)
                curveToRelative(0.29f, 2.52f, 2.43f, 4.42f, 4.97f, 4.42f)
                horizontalLineToRelative(6.73f)
                curveToRelative(2.54f, 0f, 4.67f, -1.9f, 4.97f, -4.42f)
                lineToRelative(1.35f, -11.58f)
                lineTo(2.32f, 8f)
                close()
                moveTo(6.51f, 17f)
                horizontalLineToRelative(10.99f)
                curveToRelative(0.6f, 0f, 1.06f, 0.52f, 0.99f, 1.12f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.06f, 0.5f, -0.49f, 0.88f, -0.99f, 0.88f)
                lineTo(6.51f, 19f)
                curveToRelative(-0.51f, 0f, -0.94f, -0.38f, -0.99f, -0.88f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.07f, -0.59f, 0.4f, -1.12f, 0.99f, -1.12f)
                close()
                moveTo(4.93f, 13.12f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.07f, -0.59f, 0.4f, -1.12f, 0.99f, -1.12f)
                horizontalLineToRelative(12.15f)
                curveToRelative(0.6f, 0f, 1.06f, 0.52f, 0.99f, 1.12f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.06f, 0.5f, -0.49f, 0.88f, -0.99f, 0.88f)
                lineTo(5.92f, 14f)
                curveToRelative(-0.51f, 0f, -0.94f, -0.38f, -0.99f, -0.88f)
                close()
            }
        }.also { _CupTogo = it}
