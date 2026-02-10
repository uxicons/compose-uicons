package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupTogo: ImageVector? = null

val Icons.Bs.CupTogo: ImageVector
    get() = _CupTogo ?: UXIcon(name = "CupTogo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.73f, 5f)
                lineToRelative(-0.44f, -2.19f)
                curveToRelative(-0.33f, -1.63f, -1.77f, -2.81f, -3.43f, -2.81f)
                lineTo(6.14f, 0f)
                curveToRelative(-1.66f, 0f, -3.11f, 1.18f, -3.43f, 2.81f)
                lineToRelative(-0.44f, 2.19f)
                lineTo(1.0f, 5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.17f)
                lineToRelative(1.52f, 12.91f)
                curveToRelative(0.21f, 1.76f, 1.7f, 3.09f, 3.48f, 3.09f)
                horizontalLineToRelative(9.67f)
                curveToRelative(1.77f, 0f, 3.27f, -1.33f, 3.48f, -3.09f)
                lineToRelative(1.52f, -12.91f)
                horizontalLineToRelative(1.17f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.27f)
                close()
                moveTo(5.65f, 3.4f)
                curveToRelative(0.05f, -0.23f, 0.25f, -0.4f, 0.49f, -0.4f)
                horizontalLineToRelative(11.72f)
                curveToRelative(0.24f, 0f, 0.44f, 0.17f, 0.49f, 0.4f)
                lineToRelative(0.32f, 1.6f)
                lineTo(5.33f, 5f)
                lineToRelative(0.32f, -1.6f)
                close()
                moveTo(17.33f, 20.56f)
                curveToRelative(-0.03f, 0.25f, -0.24f, 0.44f, -0.5f, 0.44f)
                lineTo(7.17f, 21f)
                curveToRelative(-0.25f, 0f, -0.47f, -0.19f, -0.5f, -0.44f)
                lineToRelative(-0.3f, -2.56f)
                horizontalLineToRelative(11.26f)
                lineToRelative(-0.3f, 2.56f)
                close()
                moveTo(18.46f, 11f)
                lineTo(5.54f, 11f)
                lineToRelative(-0.35f, -3f)
                horizontalLineToRelative(13.62f)
                lineToRelative(-0.35f, 3f)
                close()
            }
        }.also { _CupTogo = it}
