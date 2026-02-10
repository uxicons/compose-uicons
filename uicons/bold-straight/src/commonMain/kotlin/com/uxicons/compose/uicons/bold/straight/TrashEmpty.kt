package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashEmpty: ImageVector? = null

val Icons.Bs.TrashEmpty: ImageVector
    get() = _TrashEmpty ?: UXIcon(name = "TrashEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 3f)
                lineTo(23f, 0f)
                lineTo(1f, 0f)
                lineTo(1f, 3f)
                horizontalLineToRelative(1.11f)
                lineToRelative(1.41f, 17.78f)
                curveToRelative(0.14f, 1.81f, 1.68f, 3.22f, 3.49f, 3.22f)
                horizontalLineToRelative(9.98f)
                curveToRelative(1.81f, 0f, 3.35f, -1.42f, 3.49f, -3.22f)
                lineToRelative(1.41f, -17.78f)
                horizontalLineToRelative(1.11f)
                close()
                moveTo(7.84f, 3f)
                lineToRelative(2.07f, 2.07f)
                lineToRelative(-3.06f, 3.06f)
                lineToRelative(-1.43f, -1.43f)
                lineToRelative(-0.29f, -3.69f)
                horizontalLineToRelative(2.72f)
                close()
                moveTo(18.07f, 13.23f)
                lineToRelative(-0.45f, 5.67f)
                lineToRelative(-3.47f, -3.47f)
                lineToRelative(3.06f, -3.06f)
                lineToRelative(0.86f, 0.86f)
                close()
                moveTo(5.94f, 13.28f)
                lineToRelative(0.91f, -0.91f)
                lineToRelative(3.06f, 3.06f)
                lineToRelative(-3.52f, 3.52f)
                lineToRelative(-0.45f, -5.67f)
                close()
                moveTo(12.03f, 17.54f)
                lineToRelative(3.46f, 3.46f)
                horizontalLineToRelative(-6.91f)
                lineToRelative(3.46f, -3.46f)
                close()
                moveTo(12.03f, 13.3f)
                lineToRelative(-3.06f, -3.06f)
                lineToRelative(3.06f, -3.06f)
                lineToRelative(3.06f, 3.06f)
                lineToRelative(-3.06f, 3.06f)
                close()
                moveTo(18.58f, 6.75f)
                lineToRelative(-1.38f, 1.38f)
                lineToRelative(-3.06f, -3.06f)
                lineToRelative(2.07f, -2.07f)
                horizontalLineToRelative(2.66f)
                lineToRelative(-0.3f, 3.75f)
                close()
            }
        }.also { _TrashEmpty = it}
