package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileEdit: ImageVector? = null

val Icons.Rs.FileEdit: ImageVector
    get() = _FileEdit ?: UXIcon(name = "FileEdit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.59f, -0.43f, 1.27f, -0.73f, 2f, -0.88f)
                verticalLineToRelative(-1.54f)
                lineTo(12.41f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-2f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                close()
                moveTo(13f, 3.41f)
                lineToRelative(3.59f, 3.59f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(-3.59f)
                close()
                moveTo(23.12f, 11.88f)
                curveToRelative(-1.13f, -1.13f, -3.11f, -1.13f, -4.24f, 0f)
                lineToRelative(-7.88f, 7.88f)
                verticalLineToRelative(4.24f)
                horizontalLineToRelative(4.24f)
                lineToRelative(7.88f, -7.88f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                reflectiveCurveToRelative(-0.31f, -1.55f, -0.88f, -2.12f)
                close()
                moveTo(21.71f, 14.71f)
                lineToRelative(-7.29f, 7.29f)
                horizontalLineToRelative(-1.42f)
                verticalLineToRelative(-1.42f)
                lineToRelative(7.29f, -7.29f)
                curveToRelative(0.38f, -0.38f, 1.04f, -0.38f, 1.41f, 0f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.71f)
                reflectiveCurveToRelative(-0.1f, 0.52f, -0.29f, 0.71f)
                close()
            }
        }.also { _FileEdit = it}
