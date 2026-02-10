package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupTogo: ImageVector? = null

val Icons.Ts.CupTogo: ImageVector
    get() = _CupTogo ?: UXIcon(name = "CupTogo") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.0f, 5f)
                horizontalLineToRelative(-1.69f)
                lineToRelative(-0.63f, -3.01f)
                curveToRelative(-0.24f, -1.15f, -1.27f, -1.99f, -2.45f, -1.99f)
                lineTo(5.77f, 0f)
                curveToRelative(-1.18f, 0f, -2.21f, 0.84f, -2.45f, 1.99f)
                lineToRelative(-0.63f, 3.01f)
                lineTo(1.0f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.65f)
                lineToRelative(1.73f, 15.77f)
                curveToRelative(0.14f, 1.27f, 1.21f, 2.23f, 2.48f, 2.23f)
                horizontalLineToRelative(10.27f)
                curveToRelative(1.28f, 0f, 2.35f, -0.96f, 2.48f, -2.23f)
                lineToRelative(1.73f, -15.77f)
                horizontalLineToRelative(1.65f)
                verticalLineToRelative(-1f)
                close()
                moveTo(4.3f, 2.19f)
                curveToRelative(0.14f, -0.69f, 0.76f, -1.19f, 1.47f, -1.19f)
                horizontalLineToRelative(12.47f)
                curveToRelative(0.71f, 0f, 1.32f, 0.5f, 1.47f, 1.19f)
                lineToRelative(0.59f, 2.81f)
                lineTo(3.71f, 5f)
                lineToRelative(0.59f, -2.81f)
                close()
                moveTo(18.62f, 21.66f)
                curveToRelative(-0.08f, 0.76f, -0.72f, 1.34f, -1.49f, 1.34f)
                lineTo(6.87f, 23f)
                curveToRelative(-0.77f, 0f, -1.41f, -0.57f, -1.49f, -1.34f)
                lineToRelative(-0.29f, -2.66f)
                horizontalLineToRelative(13.84f)
                lineToRelative(-0.29f, 2.66f)
                close()
                moveTo(19.03f, 18f)
                lineTo(4.97f, 18f)
                lineToRelative(-0.77f, -7f)
                horizontalLineToRelative(15.59f)
                lineToRelative(-0.77f, 7f)
                close()
                moveTo(19.91f, 10f)
                lineTo(4.09f, 10f)
                lineToRelative(-0.44f, -4f)
                horizontalLineToRelative(16.69f)
                lineToRelative(-0.44f, 4f)
                close()
            }
        }.also { _CupTogo = it}
