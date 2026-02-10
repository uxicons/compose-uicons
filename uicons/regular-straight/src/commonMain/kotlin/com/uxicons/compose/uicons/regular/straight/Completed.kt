package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Completed: ImageVector? = null

val Icons.Rs.Completed: ImageVector
    get() = _Completed ?: UXIcon(name = "Completed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.83f, 2f)
                curveToRelative(-0.41f, -1.16f, -1.52f, -2f, -2.83f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.3f, 0f, -2.42f, 0.84f, -2.83f, 2f)
                lineTo(3f, 2f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(21f, 2f)
                horizontalLineToRelative(-5.17f)
                close()
                moveTo(19f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(6f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(5f, 4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(17f)
                close()
                moveTo(7.44f, 11.51f)
                lineToRelative(-1.43f, -1.35f)
                lineToRelative(1.38f, -1.45f)
                lineToRelative(1.28f, 1.21f)
                lineToRelative(2.55f, -2.55f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.69f, 2.69f)
                curveToRelative(-0.35f, 0.35f, -0.81f, 0.53f, -1.26f, 0.53f)
                curveToRelative(-0.44f, 0f, -0.88f, -0.16f, -1.23f, -0.49f)
                close()
                moveTo(12.63f, 14.78f)
                lineToRelative(-2.69f, 2.69f)
                curveToRelative(-0.35f, 0.35f, -0.81f, 0.53f, -1.26f, 0.53f)
                curveToRelative(-0.44f, 0f, -0.88f, -0.16f, -1.23f, -0.49f)
                lineToRelative(-1.43f, -1.35f)
                lineToRelative(1.38f, -1.45f)
                lineToRelative(1.28f, 1.21f)
                lineToRelative(2.55f, -2.55f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(12f, 12f)
                lineToRelative(2.04f, -2f)
                horizontalLineToRelative(2.96f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(14.04f, 16f)
                horizontalLineToRelative(2.96f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                lineToRelative(2.04f, -2f)
                close()
            }
        }.also { _Completed = it}
