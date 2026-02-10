package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderXmark: ImageVector? = null

val Icons.Tr.FolderXmark: ImageVector
    get() = _FolderXmark ?: UXIcon(name = "FolderXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 3f)
                horizontalLineToRelative(-7.03f)
                curveToRelative(-0.23f, 0f, -0.46f, -0.05f, -0.67f, -0.16f)
                lineToRelative(-3.16f, -1.58f)
                curveToRelative(-0.34f, -0.17f, -0.73f, -0.26f, -1.12f, -0.26f)
                horizontalLineToRelative(-3.03f)
                curveTo(2.02f, 1f, 0f, 3.02f, 0f, 5.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 7.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(4.5f, 2f)
                horizontalLineToRelative(3.03f)
                curveToRelative(0.23f, 0f, 0.46f, 0.05f, 0.67f, 0.16f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.34f, 0.17f, 0.73f, 0.26f, 1.12f, 0.26f)
                horizontalLineToRelative(7.03f)
                curveToRelative(1.76f, 0f, 3.22f, 1.31f, 3.46f, 3f)
                lineTo(1f, 7f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(19.5f, 22f)
                lineTo(4.5f, 22f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 8f)
                lineTo(23f, 8f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(15.85f, 11.85f)
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
            }
        }.also { _FolderXmark = it}
