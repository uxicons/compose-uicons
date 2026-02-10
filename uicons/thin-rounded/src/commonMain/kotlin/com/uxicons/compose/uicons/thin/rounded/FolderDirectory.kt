package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderDirectory: ImageVector? = null

val Icons.Tr.FolderDirectory: ImageVector
    get() = _FolderDirectory ?: UXIcon(name = "FolderDirectory") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 11.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3.86f)
                curveToRelative(-1.91f, 1.49f, -4f, 3.7f, -4f, 5.36f)
                curveToRelative(0.0f, 0.08f, 0.09f, 2f, 3.5f, 2f)
                horizontalLineToRelative(1f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-4.45f, 0f, -4.5f, -2.97f, -4.5f, -3f)
                curveToRelative(0f, -1.96f, 2.08f, -4.31f, 4.19f, -6f)
                horizontalLineToRelative(-3.69f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 7.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 5.5f)
                curveTo(0f, 3.02f, 2.02f, 1f, 4.5f, 1f)
                horizontalLineToRelative(3.03f)
                curveToRelative(0.39f, 0f, 0.77f, 0.09f, 1.12f, 0.26f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.21f, 0.1f, 0.44f, 0.16f, 0.67f, 0.16f)
                horizontalLineToRelative(7.03f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(1f, 5.5f)
                verticalLineToRelative(1.5f)
                lineTo(22.95f, 7f)
                curveToRelative(-0.24f, -1.69f, -1.69f, -3f, -3.45f, -3f)
                horizontalLineToRelative(-7.03f)
                curveToRelative(-0.39f, 0f, -0.77f, -0.09f, -1.12f, -0.26f)
                lineToRelative(-3.16f, -1.58f)
                curveToRelative(-0.21f, -0.1f, -0.44f, -0.16f, -0.67f, -0.16f)
                horizontalLineToRelative(-3.03f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                close()
                moveTo(23f, 18.5f)
                lineTo(23f, 8f)
                lineTo(1f, 8f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }.also { _FolderDirectory = it}
