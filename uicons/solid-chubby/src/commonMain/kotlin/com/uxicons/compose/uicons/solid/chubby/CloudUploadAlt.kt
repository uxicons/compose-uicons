package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudUploadAlt: ImageVector? = null

val Icons.Sc.CloudUploadAlt: ImageVector
    get() = _CloudUploadAlt ?: UXIcon(name = "CloudUploadAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.86f, 10.27f)
                curveToRelative(-0.5f, -4.41f, -4.22f, -7.77f, -8.73f, -7.77f)
                curveTo(6.28f, 2.5f, 2.34f, 6.44f, 2.34f, 11.29f)
                curveToRelative(0f, 0.92f, 0.14f, 1.81f, 0.41f, 2.68f)
                curveToRelative(-1.09f, 0.76f, -1.76f, 2.01f, -1.76f, 3.38f)
                curveToRelative(0f, 2.29f, 1.88f, 4.16f, 4.18f, 4.16f)
                horizontalLineToRelative(11.81f)
                curveToRelative(3.31f, 0f, 6.01f, -2.68f, 6.01f, -5.97f)
                curveToRelative(0f, -2.21f, -1.21f, -4.21f, -3.14f, -5.25f)
                close()
                moveTo(14.89f, 14.28f)
                curveToRelative(-0.49f, 0.26f, -1.09f, 0.07f, -1.35f, -0.42f)
                curveToRelative(-0.18f, -0.34f, -0.36f, -0.62f, -0.54f, -0.86f)
                verticalLineToRelative(3.06f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.06f)
                curveToRelative(-0.18f, 0.24f, -0.37f, 0.52f, -0.54f, 0.86f)
                curveToRelative(-0.26f, 0.49f, -0.86f, 0.68f, -1.35f, 0.42f)
                curveToRelative(-0.49f, -0.26f, -0.68f, -0.86f, -0.42f, -1.35f)
                curveToRelative(1.19f, -2.27f, 2.79f, -2.91f, 2.97f, -2.98f)
                curveToRelative(0.11f, -0.04f, 0.41f, -0.11f, 0.69f, 0f)
                curveToRelative(0.18f, 0.07f, 1.78f, 0.71f, 2.97f, 2.98f)
                curveToRelative(0.26f, 0.49f, 0.07f, 1.09f, -0.42f, 1.35f)
                close()
            }
        }.also { _CloudUploadAlt = it}
