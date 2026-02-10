package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileEdit: ImageVector? = null

val Icons.Ts.FileEdit: ImageVector
    get() = _FileEdit ?: UXIcon(name = "FileEdit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1.77f)
                curveToRelative(0.31f, -0.2f, 0.65f, -0.35f, 1f, -0.47f)
                verticalLineToRelative(-2.0f)
                lineTo(12.71f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                close()
                moveTo(13f, 1.71f)
                lineToRelative(5.29f, 5.29f)
                horizontalLineToRelative(-5.29f)
                lineTo(13f, 1.71f)
                close()
                moveTo(23.27f, 11.73f)
                curveToRelative(-0.94f, -0.94f, -2.59f, -0.94f, -3.54f, 0f)
                lineToRelative(-8.73f, 8.73f)
                verticalLineToRelative(3.54f)
                horizontalLineToRelative(3.54f)
                lineToRelative(8.73f, -8.73f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.1f, 0.73f, -1.77f)
                reflectiveCurveToRelative(-0.26f, -1.3f, -0.73f, -1.77f)
                close()
                moveTo(22.56f, 14.56f)
                lineToRelative(-8.44f, 8.44f)
                horizontalLineToRelative(-2.12f)
                verticalLineToRelative(-2.12f)
                lineToRelative(8.44f, -8.44f)
                curveToRelative(0.57f, -0.57f, 1.55f, -0.57f, 2.12f, 0f)
                curveToRelative(0.28f, 0.28f, 0.44f, 0.66f, 0.44f, 1.06f)
                reflectiveCurveToRelative(-0.16f, 0.78f, -0.44f, 1.06f)
                close()
            }
        }.also { _FileEdit = it}
