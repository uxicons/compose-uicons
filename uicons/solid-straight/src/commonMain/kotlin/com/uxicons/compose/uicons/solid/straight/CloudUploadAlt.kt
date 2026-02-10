package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudUploadAlt: ImageVector? = null

val Icons.Ss.CloudUploadAlt: ImageVector
    get() = _CloudUploadAlt ?: UXIcon(name = "CloudUploadAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.35f, 7.23f)
                curveToRelative(-1.31f, -3.15f, -4.39f, -5.23f, -7.85f, -5.23f)
                curveTo(5.81f, 2f, 2f, 5.81f, 2f, 10.5f)
                curveToRelative(0f, 0.55f, 0.05f, 1.1f, 0.16f, 1.63f)
                curveToRelative(-1.35f, 1.03f, -2.16f, 2.65f, -2.16f, 4.37f)
                curveToRelative(0f, 3.03f, 2.24f, 5.5f, 5f, 5.5f)
                horizontalLineToRelative(11.5f)
                curveToRelative(4.14f, 0f, 7.5f, -3.36f, 7.5f, -7.5f)
                curveToRelative(0f, -3.47f, -2.34f, -6.44f, -5.65f, -7.27f)
                close()
                moveTo(15.29f, 14.29f)
                lineToRelative(-2.29f, -2.29f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.29f, -3.29f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(-1.41f, 1.41f)
                close()
            }
        }.also { _CloudUploadAlt = it}
