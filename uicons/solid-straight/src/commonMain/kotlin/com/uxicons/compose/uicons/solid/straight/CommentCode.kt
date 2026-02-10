package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CommentCode: ImageVector? = null

val Icons.Ss.CommentCode: ImageVector
    get() = _CommentCode ?: UXIcon(name = "CommentCode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                horizontalLineToRelative(12f)
                lineTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(10.29f, 15.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.3f, -3.3f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.04f, 0f, -2.81f)
                lineToRelative(3.3f, -3.3f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.3f, 3.3f)
                lineToRelative(3.3f, 3.28f)
                close()
                moveTo(18.42f, 13.41f)
                lineToRelative(-3.3f, 3.3f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.3f, -3.3f)
                lineToRelative(-3.3f, -3.28f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.3f, 3.3f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.04f, 0f, 2.81f)
                close()
            }
        }.also { _CommentCode = it}
