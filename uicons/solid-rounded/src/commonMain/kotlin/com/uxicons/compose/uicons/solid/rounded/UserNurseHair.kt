package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserNurseHair: ImageVector? = null

val Icons.Sr.UserNurseHair: ImageVector
    get() = _UserNurseHair ?: UXIcon(name = "UserNurseHair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 9f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                curveToRelative(-2.61f, 0f, -4.83f, -1.67f, -5.65f, -4f)
                horizontalLineToRelative(1.65f)
                curveToRelative(1.77f, 0f, 3.37f, -0.78f, 4.46f, -2f)
                close()
                moveTo(18f, 7f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                close()
                moveTo(18.5f, 16.69f)
                curveToRelative(-1.05f, -1.0f, -2.78f, -0.88f, -3.73f, 0.23f)
                lineToRelative(-2.77f, 3.47f)
                lineToRelative(-2.79f, -3.52f)
                curveToRelative(-0.91f, -1.07f, -2.69f, -1.18f, -3.69f, -0.2f)
                curveToRelative(-1.52f, 1.42f, -2.51f, 3.9f, -2.51f, 6.32f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(16.0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -2.41f, -0.98f, -4.88f, -2.5f, -6.31f)
                close()
            }
        }.also { _UserNurseHair = it}
