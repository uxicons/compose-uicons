package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderMinus: ImageVector? = null

val Icons.Rr.FolderMinus: ImageVector
    get() = _FolderMinus ?: UXIcon(name = "FolderMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 8f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 23f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 6f)
                curveTo(0f, 3.24f, 2.24f, 1f, 5f, 1f)
                horizontalLineToRelative(2.53f)
                curveToRelative(0.46f, 0f, 0.93f, 0.11f, 1.34f, 0.32f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.14f, 0.07f, 0.29f, 0.1f, 0.45f, 0.1f)
                horizontalLineToRelative(6.53f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(2f, 6f)
                verticalLineToRelative(1f)
                lineTo(21.83f, 7f)
                curveToRelative(-0.41f, -1.16f, -1.52f, -2f, -2.83f, -2f)
                horizontalLineToRelative(-6.53f)
                curveToRelative(-0.46f, 0f, -0.93f, -0.11f, -1.34f, -0.32f)
                lineToRelative(-3.16f, -1.58f)
                curveToRelative(-0.14f, -0.07f, -0.29f, -0.1f, -0.45f, -0.1f)
                horizontalLineToRelative(-2.53f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                close()
                moveTo(22f, 18f)
                lineTo(22f, 9f)
                lineTo(2f, 9f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                close()
            }
        }.also { _FolderMinus = it}
