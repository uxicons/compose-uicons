package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplayCode: ImageVector? = null

val Icons.Rs.DisplayCode: ImageVector
    get() = _DisplayCode ?: UXIcon(name = "DisplayCode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.42f, 8.59f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.04f, 0f, 2.81f)
                lineToRelative(-3.3f, 3.3f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.3f, -3.3f)
                lineToRelative(-3.3f, -3.28f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.3f, 3.3f)
                close()
                moveTo(8.88f, 5.29f)
                lineToRelative(-3.3f, 3.3f)
                curveToRelative(-0.77f, 0.78f, -0.77f, 2.04f, 0f, 2.81f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.3f, -3.28f)
                lineToRelative(3.3f, -3.3f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(13f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                lineTo(6f, 23f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                lineTo(0f, 19f)
                lineTo(0f, 4f)
                curveTo(0f, 2.35f, 1.35f, 1f, 3f, 1f)
                lineTo(21f, 1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(15f)
                lineTo(13f, 19f)
                close()
                moveTo(2f, 17f)
                lineTo(22f, 17f)
                lineTo(22f, 4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(13f)
                close()
            }
        }.also { _DisplayCode = it}
